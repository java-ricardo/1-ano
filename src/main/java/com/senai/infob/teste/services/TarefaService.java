package com.senai.infob.teste.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infob.teste.models.Tarefa;
import com.senai.infob.teste.repositories.TarefaRepository;
import java.util.List;

@Service
public class TarefaService {
    
    @Autowired
    public TarefaRepository tarefaRepository;

    public long count() {
        return tarefaRepository.count();
    }

    public Tarefa salvar(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);

    }
    
    public boolean delete(Integer id) {
        Tarefa tarefa = tarefaRepository.findById(id).get();
        if(tarefa != null) {
            tarefaRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Tarefa buscar(Integer id) {
        return tarefaRepository.findById(id).get();
    }

    public List<Tarefa> listar() {
        return tarefaRepository.findAll();
    }

    public Tarefa atualizar(Tarefa tarefa, Integer id) {
        Tarefa e = buscar(id);
        if (e != null) {
            tarefa.setTarefaId(id);
            return tarefaRepository.save(tarefa);
        }
        return null;

    }

}