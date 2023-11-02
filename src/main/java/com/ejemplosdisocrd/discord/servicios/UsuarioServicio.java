
package com.ejemplosdisocrd.discord.servicios;

import com.ejemplosdisocrd.discord.entidades.Usuario;
import com.ejemplosdisocrd.discord.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {
    
    @Autowired
    private UsuarioRepositorio usuariorep;
    public void crearUsuario(String nombre, String email, String password, String password2) throws Exception{
        validar(nombre, email, password, password2);
        Usuario usuario = new Usuario();
        
        usuario.setNombre(nombre);
        usuario.setEmail(email);
        usuario.setPassword(password);
        //guardar base de datos
        usuariorep.save(usuario);
    }
    
    private void validar(String nombre, String email, String password, String password2) throws Exception {
        if(nombre == null || nombre.isEmpty()){
           throw new Exception("El nombre esta nulo o vacío"); 
        }
         if(email == null || email.isEmpty()){
           throw new Exception("El email esta nulo o vacío"); 
        }
          if(password == null || password.isEmpty()){
           throw new Exception("El password esta nulo o vacío"); 
        }
           if(password2 == null || password2.isEmpty()){
           throw new Exception("El nombre esta nulo o vacío"); 
        }
           if(!password.equals(password2)){
               throw new Exception("Las contraseñas no coinciden");
           }
    }
    
}
