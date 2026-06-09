package com.example.nebulamusic.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.example.nebulamusic.Model.Usuario;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService {
    private final Map<String, Usuario> usuarios = new ConcurrentHashMap<>();


    public UsuarioService() {
    }

    public void registrar(Usuario usuario){
        usuarios.put(usuario.getCorreo(), usuario);
    }

    public boolean existeCorreo(String correo){
        return usuarios.containsKey(correo);
    }

    public boolean auntentificar(String correo, String password){
        Usuario usuario = usuarios.get(correo);

        return usuario != null && usuario.getPassword().equals(password);
    }


}
