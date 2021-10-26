package com.example.E07_ModelosDeDatosManyToMany.service;

import com.example.E07_ModelosDeDatosManyToMany.model.AddedTo;
import com.example.E07_ModelosDeDatosManyToMany.model.AddedToPK;
import com.example.E07_ModelosDeDatosManyToMany.repository.AddedToRepository;
import com.example.E07_ModelosDeDatosManyToMany.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class AddedToService extends BaseService<AddedTo, AddedToPK, AddedToRepository> {
}
