package com.senai.infob.teste.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infob.teste.models.Usuario;
import com.senai.infob.teste.repositories.UsuarioRepository;
import java.util.List;

@Service
public class UsuarioService {
    
    @Autowired
    public UsuarioRepository usuarioRepository;

    public long count() {
        return usuarioRepository.count();
    }

    public Usuario cadastro(Usuario usuario) {
        return usuarioRepository.save(usuario);

    }
    
    public boolean delete(Integer id) {
        Usuario usuario = usuarioRepository.findById(id).get();
        if(usuario != null) {
            usuarioRepository.deleteById(id);
            return true;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
        }
        return false;
    }

    public String login(String email, String senha) {
        Usuario usuario = usuarioRepository.findByEmail(email);
        if (usuario != null && senha.equals(usuario.getSenha())) {

            return "login efetuado com sucesso";
        }
        return "falha ao efetuar login";

        
    }

    public Usuario buscar(Integer id) {
        return usuarioRepository.findById(id).get();
    }

    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    public Usuario atualizar(Usuario usuario, Integer id) {
        Usuario e = buscar(id);
        if (e != null) {
            usuario.setUsuarioId(id);
            return usuarioRepository.save(usuario);
        }
        return null;

    }

}
