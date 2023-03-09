package com.example.demo.Usuario;

import lombok.*;

@Getter
@Setter

public class Usuario {
    
    private Integer id;
    private String nome;

    public Usuario(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

}
