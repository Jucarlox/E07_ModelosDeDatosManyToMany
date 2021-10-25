package com.example.E07_ModelosDeDatosManyToMany.repository;

import com.example.E07_ModelosDeDatosManyToMany.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayListRepository extends JpaRepository<Playlist, Long> {
}
