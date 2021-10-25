package com.example.E07_ModelosDeDatosManyToMany.service;

import com.example.E07_ModelosDeDatosManyToMany.model.Artist;
import com.example.E07_ModelosDeDatosManyToMany.repository.ArtistRepository;
import com.example.E07_ModelosDeDatosManyToMany.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ArtistService extends BaseService<Artist, Long, ArtistRepository> {
}
