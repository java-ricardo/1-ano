package com.senai.infob.teste.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infob.teste.models.Calendario;
import com.senai.infob.teste.repositories.CalendarioRepository;
import java.util.List;

@Service
public class CalendarioService {
    
    @Autowired
    public CalendarioRepository calendarioRepository;

    public long count() {
        return calendarioRepository.count();
    }

    public Calendario salvar(Calendario calendario) {
        return calendarioRepository.save(calendario);

    }
    
    public boolean delete(Integer id) {
        Calendario calendario = calendarioRepository.findById(id).get();
        if(calendario != null) {
            calendarioRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Calendario buscar(Integer id) {
        return calendarioRepository.findById(id).get();
    }

    public List<Calendario> listar() {
        return calendarioRepository.findAll();
    }

    public Calendario atualizar(Calendario calendario, Integer id) {
        Calendario e = buscar(id);
        if (e != null) {
            calendario.setCalendarioId(id);
            return calendarioRepository.save(calendario);
        }
        return null;

    }
}