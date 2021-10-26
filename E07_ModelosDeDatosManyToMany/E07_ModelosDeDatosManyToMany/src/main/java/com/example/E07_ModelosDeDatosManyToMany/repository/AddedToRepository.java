package com.example.E07_ModelosDeDatosManyToMany.repository;

import com.example.E07_ModelosDeDatosManyToMany.model.AddedTo;
import com.example.E07_ModelosDeDatosManyToMany.model.AddedToPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddedToRepository extends JpaRepository<AddedTo, AddedToPK> {
}
