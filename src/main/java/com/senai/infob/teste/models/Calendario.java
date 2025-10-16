package com.senai.infob.teste.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="calendario")
public class Calendario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer calendarioId;

    @Column(name="data_realizacao")
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "tarefa_id", nullable = false)
    private Tarefa tarefa;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    public Calendario() {
    }

    public Calendario(Integer calendarioId, LocalDate data, Tarefa tarefa, Usuario usuario) {
        this.calendarioId = calendarioId;
        this.data = data;
        this.tarefa = tarefa;
        this.usuario = usuario;
    }

    public Integer getCalendarioId() {
        return calendarioId;
    }

    public void setCalendarioId(Integer calendarioId) {
        this.calendarioId = calendarioId;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
