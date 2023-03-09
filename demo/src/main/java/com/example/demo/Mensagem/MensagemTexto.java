package com.example.demo.Mensagem;

import com.example.demo.Usuario.Usuario;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MensagemTexto extends Mensagem {

    private String texto;

    public MensagemTexto(String texto, Usuario autor, Integer id) {
        super(autor, id);
        this.texto = texto;
    }
    
}
