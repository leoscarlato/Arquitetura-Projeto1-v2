package com.example.demo.Mensagem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/mensagem")
public class MensagemController {

    @Autowired
    private MensagemService mensagemService;

    @GetMapping
    public List<Mensagem> listar_mensagens() {
        return mensagemService.listarMensagens();
    }

    @GetMapping("/{id}")
    public Mensagem buscar_mensagem(@PathVariable Integer id) {
        return mensagemService.buscarMensagem(id);
    }

    @PostMapping("/Text")
    public MensagemTexto criarMensagemTexto(@RequestBody Map<String, String> mensagem) {
        return mensagemService.criarMensagemTexto(mensagem);
    }
    
}
