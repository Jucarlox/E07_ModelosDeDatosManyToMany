package com.example.E07_ModelosDeDatosManyToMany.repository;

import com.example.E07_ModelosDeDatosManyToMany.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
