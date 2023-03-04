package com.example.demo.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> listar_usuarios() {
        return usuarioService.listar_usuarios();
    }

    @GetMapping("/{id}")
    public Usuario buscar_usuario(@PathVariable Integer id) {
        return usuarioService.buscar_usuario(id);
    }

    @PostMapping
    public void criar_usuario(@RequestBody Usuario usuario) {
        usuarioService.criar_usuario(usuario);
    }
    
}
