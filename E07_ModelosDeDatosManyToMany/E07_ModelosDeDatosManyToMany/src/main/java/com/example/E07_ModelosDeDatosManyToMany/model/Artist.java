package com.example.E07_ModelosDeDatosManyToMany.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter@Setter
@NoArgsConstructor@AllArgsConstructor
@Builder
public class Artist {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song s) {
        this.songs.add(s);
        s.setArtist(this);
    }

    public void removeSong(Song s) {
        this.songs.remove(s);
        s.setArtist(null);
    }


}
