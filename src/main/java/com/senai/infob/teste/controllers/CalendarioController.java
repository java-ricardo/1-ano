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

import com.senai.infob.teste.models.Calendario;
import com.senai.infob.teste.services.CalendarioService;




@RestController
@RequestMapping("/calendario")
public class CalendarioController {
    
    @Autowired
    public CalendarioService calendarioService;


    @GetMapping("/count")
    public long count() {
        return calendarioService.count();
    }

    @PostMapping("/salvar")
    public Calendario salvar(@RequestBody Calendario calendario) {
        return calendarioService.salvar(calendario);

    }

    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable Integer id) {
        boolean deletou = calendarioService.delete(id);
        if (deletou) {
            return "Usuário removido com sucesso";
    }
        return "Falha ao remover o usuário";
    }

    @GetMapping("/buscar/{id}")
    public Calendario buscar(@PathVariable Integer id) {
        return calendarioService.buscar(id);
    }
    
    @GetMapping("/listar")
    public List<Calendario> listar() {
        return calendarioService.listar();
    }

    @PutMapping("/atualizar/{id}")
    public Calendario atualizar( @RequestBody Calendario calendario, @PathVariable Integer id) {
        return calendarioService.atualizar(calendario, id);
    }

}