package com.sv.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sv.modelos.users;


@Repository
public interface InterfaceUsuario  extends CrudRepository<users, Integer>{

}
