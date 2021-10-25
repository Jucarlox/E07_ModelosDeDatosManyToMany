package com.example.E07_ModelosDeDatosManyToMany.model;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class AddedTo {

    @Builder.Default
    @EmbeddedId
    private AddedToPK id = new AddedToPK();

    @ManyToOne
    @MapsId("song_id")
    @JoinColumn(name="song_id")
    private Song song;

    @ManyToOne
    @MapsId("playlist_id")
    @JoinColumn(name="playlist_id")
    private Playlist playlist;

    private String datetime;
    private String order;

    /*public void addToSong(Song s) {
        song = s;
        s.getPlaylist().getSongs().add(s);
    }

    public void removeFromSong(Song s) {
        s.getPlaylist().getSongs().remove(this);
        song = null;
    }*/


















}
