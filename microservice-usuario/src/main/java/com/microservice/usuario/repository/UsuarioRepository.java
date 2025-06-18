package com.microservice.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.usuario.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{

}

