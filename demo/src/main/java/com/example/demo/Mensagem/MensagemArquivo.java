package com.example.demo.Mensagem;

import com.example.demo.Usuario.Usuario;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MensagemArquivo extends Mensagem{

    private String nomeArquivo;

    public MensagemArquivo(String nomeArquivo, Usuario autor, Integer id) {
        super(autor, id);
        this.nomeArquivo = nomeArquivo;
    }
    
    
}
