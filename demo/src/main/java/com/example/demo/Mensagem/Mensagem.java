package com.example.demo.Mensagem;
import com.example.demo.Usuario.Usuario;

import lombok.*;


@Getter
@Setter

public abstract class Mensagem {

    private String texto;
    private Usuario autor;
    private Usuario destinatario;

    public Mensagem(String texto, Usuario autor, Usuario destinatario) {
        this.texto = texto;
        this.autor = autor;
        this.destinatario = destinatario;
    }

}
