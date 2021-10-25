package com.example.E07_ModelosDeDatosManyToMany.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter@Setter
@AllArgsConstructor@NoArgsConstructor
@Builder
public class Song {
    @Id
    @GeneratedValue
    private Long id;
    private String title;


    @ManyToOne(fetch = FetchType.EAGER)
    private Artist artist;

    private String album;
    private String year;



    @Builder.Default
    @OneToMany
    private List<AddedTo> addedTos = new ArrayList<>();

    public Song(Long id, String title, Artist artist, String album, String year) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.year = year;
    }


    //@ManyToMany(fetch = FetchType.EAGER)
    //private List<Playlist> playlists = new ArrayList<>();


}
