package _Desk.LaizaZaic.service;

import java.util.List;

import _Desk.LaizaZaic.entity.Usuario;

public interface UsuarioService {

    public Usuario novoUsuario(Usuario usuario);

    public List<Usuario> todosUsuarios();

    public Usuario buscarPeloId(Long id);
    
}