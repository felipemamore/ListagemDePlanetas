package com.example.listagemdeplanetas;

public class Planetas {
    String nome;
    int foto;

    public Planetas(String nome, int foto){
        this.nome = nome;
        this.foto = foto;
    }
    public String getName(){
        return nome;

    }

    public int getFoto() {
        return foto;
    }
}
