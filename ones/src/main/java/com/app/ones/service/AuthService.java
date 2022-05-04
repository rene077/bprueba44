
package com.app.ones.service;

import com.app.ones.models.Usuario;
import com.app.ones.models.dto.UserDto;
import com.app.ones.repos.AuthRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    public AuthRepo repository;
    
    @Autowired
    PasswordEncoder passwordEncoder;
          ///para saber si esta habilitado logueo de verificacion
    public boolean isUserEnabled(UserDto userDto) {
        boolean isUserEnabled = false;
        List<Usuario> usuarios = repository.findByEmailAndIsEnabledTrue(userDto.getEmail());
        if (!usuarios.isEmpty()) {//deberia existir solo un registro en teoria
            Usuario usuario = usuarios.get(0);//traigoel existente unico
            if (passwordEncoder.matches(userDto.getPassword(), usuario.getPassword()))
                isUserEnabled = true;//esta autenticado..al compararlo
        }                           //caso contrario ya esta inicializada como falso
        return isUserEnabled;//devolvemos la verificacion booleana...
    }
    
    public void crearUsuario(Usuario usuario) throws Exception{
        List<Usuario> usuarios = repository.findByEmailAndIsEnabledTrue(usuario.getEmail());
        if (!usuarios.isEmpty()) {             //para evitar creacion de usuario iguales
            throw new Exception("El email ya está registrado.");
        } else {
            usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
            usuario.setEnabled(true);
            repository.save(usuario);
        }
    }
}