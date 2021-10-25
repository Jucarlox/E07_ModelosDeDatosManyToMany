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

    @ManyToOne
    private Artist artist;

    private String album;
    private String year;

    @ManyToOne
    private Playlist playlist;

    @Builder.Default
    @OneToMany
    private List<AddedTo> addedTos = new ArrayList<>();





    //@ManyToMany(fetch = FetchType.EAGER)
    //private List<Playlist> playlists = new ArrayList<>();


}
