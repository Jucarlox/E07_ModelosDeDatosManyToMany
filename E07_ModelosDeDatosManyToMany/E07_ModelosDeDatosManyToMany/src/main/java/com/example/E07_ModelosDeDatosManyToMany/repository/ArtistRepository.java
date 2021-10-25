package com.example.E07_ModelosDeDatosManyToMany.repository;

import com.example.E07_ModelosDeDatosManyToMany.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
