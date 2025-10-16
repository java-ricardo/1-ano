package com.senai.infob.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infob.teste.models.Tarefa;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {

    
}