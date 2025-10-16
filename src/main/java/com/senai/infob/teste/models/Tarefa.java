package com.senai.infob.teste.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tarefa")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer tarefaId;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private Integer descricao;

    @Column(name = "status")
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Tarefa tarefa;

    public Tarefa() {
    }

    public Tarefa(Integer tarefaId, String nome, Integer descricao, boolean status, Tarefa tarefa) {
        this.tarefaId = tarefaId;
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.tarefa = tarefa;
    }

    public Integer getTarefaId() {
        return tarefaId;
    }

    public void setTarefaId(Integer tarefaId) {
        this.tarefaId = tarefaId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDescricao() {
        return descricao;
    }

    public void setDescricao(Integer descricao) {
        this.descricao = descricao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    
}
