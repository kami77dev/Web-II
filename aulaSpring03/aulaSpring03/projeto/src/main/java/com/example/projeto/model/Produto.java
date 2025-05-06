package com.example.projeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


public class Produto{
    private Long id;
    private String nome;
    private Integer quantidade;
    private BigDecimal valor;


    private Produto (){

    }

    public Produto(String nome, Iteger quantidade, BigDecimal valor){
    this.nome=nome;
    this.quantidade=quantidade;
    this.valor=valor;
    }

      public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setQuantidade(Integer quantidade){
        this.quantidade=quantidade;
    }

    public String geQuantidade() {
        return quantidade;
    }
}