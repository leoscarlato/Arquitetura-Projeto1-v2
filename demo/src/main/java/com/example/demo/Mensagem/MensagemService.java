package com.example.demo.Mensagem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Usuario.UsuarioService;
import com.example.demo.Usuario.Usuario;

@Service
public class MensagemService {

    private List<Mensagem> mensagens = new ArrayList<Mensagem>();

    @Autowired
    private UsuarioService usuarioService;

    public List<Mensagem> listarMensagens(){
        return mensagens;
    }

    public Mensagem buscarMensagem(Integer id){
        for (Mensagem mensagem : mensagens) {
            if (mensagem.getId().equals(id)) {
                return mensagem;
            }
        }
        return null;
    }

    public List<Mensagem> buscarMensagemUsuario(Integer id){
        Usuario usuario = usuarioService.buscar_usuario(id);
        List<Mensagem> mensagens_usuario = new ArrayList<Mensagem>();
        for (Mensagem mensagem : mensagens) {
            if (mensagem.getAutor().getId().equals(id)) {
                mensagens_usuario.add(mensagem);
            }
        }
        return mensagens_usuario;
    }

    public MensagemTexto criarMensagemTexto(Map<String, String> corpo){
        int novoId = mensagens.size() + 1;
        String id_usuario = corpo.get("id");
        Usuario usuario = usuarioService.buscar_usuario(Integer.parseInt(id_usuario));
        MensagemTexto mensagem = new MensagemTexto(corpo.get("texto"), usuario , novoId);
        mensagens.add(mensagem);
        return mensagem;
    }

    public MensagemArquivo criarMensagemArquivo(Map<String, String> corpo){
        int novoId = mensagens.size() + 1;
        String id_usuario = corpo.get("id");
        Usuario usuario = usuarioService.buscar_usuario(Integer.parseInt(id_usuario));
        MensagemArquivo mensagem = new MensagemArquivo(corpo.get("nome_arquivo"), usuario , novoId);
        mensagens.add(mensagem);
        return mensagem;
    }
}
