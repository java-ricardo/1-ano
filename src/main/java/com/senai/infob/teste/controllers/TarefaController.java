package com.senai.infob.teste.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infob.teste.models.Tarefa;
import com.senai.infob.teste.services.TarefaService;




@RestController
@RequestMapping("/Tarefa")
public class TarefaController {
    
    @Autowired
    public TarefaService tarefaService;


    @GetMapping("/count")
    public long count() {
        return tarefaService.count();
    }

    @PostMapping("/salvar")
    public Tarefa salvar(@RequestBody Tarefa tarefa) {
        return tarefaService.salvar(tarefa);

    }

    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable Integer id) {
        boolean deletou = tarefaService.delete(id);
        if (deletou) {
            return "Tarefa removido com sucesso";
    }
        return "Falha ao remover o tarefa";
    }

    @GetMapping("/buscar/{id}")
    public Tarefa buscar(@PathVariable Integer id) {
        return tarefaService.buscar(id);
    }
    
    @GetMapping("/listar")
    public List<Tarefa> listar() {
        return tarefaService.listar();
    }

    @PutMapping("/atualizar/{id}")
    public Tarefa atualizar( @RequestBody Tarefa tarefa, @PathVariable Integer id) {
        return tarefaService.atualizar(tarefa, id);
    }

}