package com.example.demo.Usuario;

import lombok.*;

@Getter
@Setter

public class Usuario {
    
    private Integer id;
    private String nome;
    private String email;

    public Usuario(Integer id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

}
