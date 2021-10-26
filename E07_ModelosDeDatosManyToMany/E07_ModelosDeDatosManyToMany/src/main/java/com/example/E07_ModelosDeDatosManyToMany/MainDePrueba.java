package com.example.E07_ModelosDeDatosManyToMany;

import com.example.E07_ModelosDeDatosManyToMany.model.AddedTo;
import com.example.E07_ModelosDeDatosManyToMany.model.Artist;
import com.example.E07_ModelosDeDatosManyToMany.model.Playlist;
import com.example.E07_ModelosDeDatosManyToMany.model.Song;
import com.example.E07_ModelosDeDatosManyToMany.service.AddedToService;
import com.example.E07_ModelosDeDatosManyToMany.service.ArtistService;
import com.example.E07_ModelosDeDatosManyToMany.service.PlaylistService;
import com.example.E07_ModelosDeDatosManyToMany.service.SongService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final SongService songService;
    private final ArtistService artistService;
    private final PlaylistService playlistService;
    private final AddedToService addedToService;

    @PostConstruct
    public void test(){

        Artist artist1 = Artist.builder()
                .name("David Bisbal")
                .songs(new ArrayList<>())
                .build();
        artistService.save(artist1);
        Artist artist2 = Artist.builder()
                .name("Bad bunny")
                .songs(new ArrayList<>())
                .build();
        artistService.save(artist2);

        Song song1 = Song.builder()
                .title("Ave Maria")
                .album("Al estrellato")
                .year("2020")
                .artist(artist1)

                .build();
        Song song2 = Song.builder()
                .title("Amarillo")
                .album("Los Colores")
                .year("2022")
                .artist(artist2)

                .build();
        songService.save(song1);
        songService.save(song2);

        artist1.addSong(song1);
        artist2.addSong(song2);

        artistService.save(artist1);
        artistService.save(artist2);


        Playlist playlist1 = Playlist.builder()
                .name("Favoritas")
                .descripcion("Canciones favoritas")
                .songs(new ArrayList<>())
                .build();
        playlist1.getSongs().add(song1);
        playlist1.getSongs().add(song2);
        playlistService.save(playlist1);

        AddedTo addedTo1 = AddedTo.builder()
                .orden(1)
                .dateTime(LocalDateTime.now())
                .playlist(playlist1)
                .song(song1)
                .build();

        addedToService.save(addedTo1);



        artistService.
                findAll()
                .forEach(a -> System.out.printf("%s %s \n", a.getName(), a.getSongs() ));

        songService.
                findAll()
                .forEach(s -> System.out.printf("%s %s %s %s \n", s.getTitle(), s.getYear(), s.getAlbum(), s.getArtist()));

        playlistService.
                findAll()
                .forEach(p-> System.out.printf("%s %s  \n",p.getName(), p.getDescripcion()));
        playlistService.
                findAll()
                .forEach(p->p.getSongs().forEach(x-> System.out.printf("Lista de canciones de Playlist1: %s %s %s\n", x.getTitle(), x.getAlbum(), x.getYear())));

        addedToService.findAll()
                .forEach(a->System.out.printf(" Fecha de creacion:%s  Orden:%s  NombrePlaylist:%s  NombreCancion:%s\n", a.getDateTime(), a.getOrden(), a.getPlaylist().getName(), a.getSong().getTitle()));

        



        /*artistService.delete(artist1);

        artistService.
                findAll()
                .forEach(a -> System.out.printf("%s %s \n", a.getName(), a.getSongs() ));*/

        /*songService.delete(song1);

        songService.
                findAll()
                .forEach(s -> System.out.printf("%s %s %s %s \n", s.getTitle(), s.getYear(), s.getAlbum(), s.getArtist()));*/

        /*playlistService.delete(playlist1);

        playlistService.
                findAll()
                .forEach(p-> System.out.printf("%s %s %s \n",p.getName(), p.getDescripcion(), p.getSongs()));*/


    }
}
