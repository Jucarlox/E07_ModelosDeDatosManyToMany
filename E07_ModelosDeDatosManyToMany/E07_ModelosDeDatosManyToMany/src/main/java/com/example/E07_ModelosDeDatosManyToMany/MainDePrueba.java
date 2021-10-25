package com.example.E07_ModelosDeDatosManyToMany;

import com.example.E07_ModelosDeDatosManyToMany.model.Artist;
import com.example.E07_ModelosDeDatosManyToMany.model.Playlist;
import com.example.E07_ModelosDeDatosManyToMany.model.Song;
import com.example.E07_ModelosDeDatosManyToMany.service.ArtistService;
import com.example.E07_ModelosDeDatosManyToMany.service.PlaylistService;
import com.example.E07_ModelosDeDatosManyToMany.service.SongService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final SongService songService;
    private final ArtistService artistService;
    private final PlaylistService playlistService;

    @PostConstruct
    public void test(){

        Artist artist1 = Artist.builder()
                .name("David Bisbal")
                .songs(new ArrayList<>())
                .build();
        artistService.save(artist1);

        Song song1 = Song.builder()
                .title("Ave Maria")
                .album("Al estrellato")
                .year("2020")
                .artist(artist1)

                .build();
        songService.save(song1);

        artist1.addSong(song1);

        artistService.save(artist1);


        Playlist playlist1 = Playlist.builder()
                .name("Favoritas")
                .descripcion("Canciones favoritas")
                .songs(new ArrayList<>())
                .build();
        playlist1.getSongs().add(song1);
        playlistService.save(playlist1);


        artistService.
                findAll()
                .forEach(a -> System.out.printf("%s %s \n", a.getName(), a.getSongs() ));

        songService.
                findAll()
                .forEach(s -> System.out.printf("%s %s %s %s \n", s.getTitle(), s.getYear(), s.getAlbum(), s.getArtist()));

        playlistService.
                findAll()
                .forEach(p-> System.out.printf("%s %s %s \n",p.getName(), p.getDescripcion(), p.getSongs()));

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
