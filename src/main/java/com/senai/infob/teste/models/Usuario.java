package com.senai.infob.teste.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer usuarioId;

    @Column(name="nome")
    private String nome;

    @Column(name="senha")
    private String senha;

    @Column(name="email")
    private String email;

    @Column(name="cpf")
    private long cpf;

    public Usuario() {
    }

    public Usuario(Integer usuarioId, String nome, String senha, String email, long cpf) {
        this.usuarioId = usuarioId;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.cpf = cpf;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
}
