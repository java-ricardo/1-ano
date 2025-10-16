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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infob.teste.models.Usuario;
import com.senai.infob.teste.services.UsuarioService;




@RestController
@RequestMapping("/Produto")
public class UsuarioController {
    
    @Autowired
    public UsuarioService usuarioService;


    @GetMapping("/count")
    public long count() {
        return usuarioService.count();
    }

    @PostMapping("/salvar")
    public Usuario cadastro(@RequestBody Usuario usuario) {
        return usuarioService.cadastro(usuario);

    }

    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable Integer id) {
        boolean deletou = usuarioService.delete(id);
        if (deletou) {
            return "Usuário removido com sucesso";
    }
        return "Falha ao remover o usuário";
    }

    @GetMapping("/buscar/{id}")
    public Usuario buscar(@PathVariable Integer id) {
        return usuarioService.buscar(id);
    }
    
    @GetMapping("/listar")
    public List<Usuario> listar() {
        return usuarioService.listar();
    }

    @PutMapping("/atualizar/{id}")
    public Usuario atualizar( @RequestBody Usuario usuario, @PathVariable Integer id) {
        return usuarioService.atualizar(usuario, id);
    }

    //@PutMapping("/atualizar-boolean/{id}")
    //public Produto atualizar( @RequestBody Produto usuario, @PathVariable Integer id) {
        //boolean atualizou = usuarioService.atualizarBoolean(usuario, id);
        //if(atualizou) {
            //return "Produto Atualizou com sucesso!";
        //}
        //return"Falha ao atualizar o usuario";
    //}
    //TODO: process POST request

    @PostMapping("/login")
    public String login(@RequestParam String email,@RequestParam String senha) {      
        return usuarioService.login(email, senha);
    }
    
}