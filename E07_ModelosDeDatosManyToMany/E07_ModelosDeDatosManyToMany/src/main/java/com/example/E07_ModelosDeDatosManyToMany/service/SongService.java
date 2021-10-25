package com.example.E07_ModelosDeDatosManyToMany.service;

import com.example.E07_ModelosDeDatosManyToMany.model.Song;
import com.example.E07_ModelosDeDatosManyToMany.repository.SongRepository;
import com.example.E07_ModelosDeDatosManyToMany.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class SongService extends BaseService<Song, Long, SongRepository> {
}
