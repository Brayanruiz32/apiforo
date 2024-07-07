package com.principal.apiforo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.principal.apiforo.entities.Topico;

public interface TopicoRepository extends JpaRepository<Topico,Long> {

}
