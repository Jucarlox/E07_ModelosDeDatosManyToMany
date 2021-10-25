package com.example.E07_ModelosDeDatosManyToMany.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter@Setter
@NoArgsConstructor@AllArgsConstructor
@Builder
public class Playlist {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String descripcion;

    @ManyToOne
    private List<Song> songs = new ArrayList<>();

    @Builder.Default
    @OneToMany
    private List<AddedTo> addedTos = new ArrayList<>();
}
