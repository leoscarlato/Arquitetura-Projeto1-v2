package com.example.demo.Usuario;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> listar_usuarios() {
        return usuarios;
    }

    public Usuario buscar_usuario(Integer id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }
        throw new RuntimeException("Usuário não encontrado");
    }

    public Usuario criar_usuario(Usuario usuario) {
        int novoId = usuarios.size() + 1;
        usuario.setId(novoId);
        usuarios.add(usuario);
        return usuario;
    }



}
