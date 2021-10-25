package com.example.E07_ModelosDeDatosManyToMany.service;

import com.example.E07_ModelosDeDatosManyToMany.model.Playlist;
import com.example.E07_ModelosDeDatosManyToMany.repository.PlayListRepository;
import com.example.E07_ModelosDeDatosManyToMany.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class PlaylistService extends BaseService<Playlist, Long, PlayListRepository> {
}
