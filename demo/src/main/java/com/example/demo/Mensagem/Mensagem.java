package com.example.demo.Mensagem;
import com.example.demo.Usuario.Usuario;

import lombok.*;


@Getter
@Setter

public abstract class Mensagem {

    private Usuario autor;
    private Integer id;

    public Mensagem(Usuario autor, Integer id) {
        this.autor = autor;
        this.id = id;
    }

}
