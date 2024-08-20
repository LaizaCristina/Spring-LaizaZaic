package _Desk.LaizaZaic.service;

import java.util.List;

import _Desk.LaizaZaic.entity.Usuario;

public class UsuarioServiceImpl implements UsuarioService{

    @Override
    public Usuario novoUsuario(Usuario usuario) {
        // TODO Auto-generated method stub


        throw new UnsupportedOperationException("Unimplemented method 'novoUsuario'");
    }

    @Override
    public List<Usuario> todosUsuarios() {
        // TODO Auto-generated method stub
        List<Usuario> usuarios = new ArrayList<Usuario>();
        for(Usuario usuario: repo.findAll()){
            usuarios.add(usuario);
        }
        return Usuarios;
        throw new UnsupportedOperationException("Unimplemented method 'todosUsuarios'");
    }

    @Override
    public Usuario buscarPeloId(Long id) {
        // TODO Auto-generated method stub
        Optional <Usuario> usuarioOp = repo.findById(id);
        
        throw new UnsupportedOperationException("Unimplemented method 'buscarPeloId'");
    }
    
}