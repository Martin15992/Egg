
package com.ejemplosdisocrd.discord.controladores;

import com.ejemplosdisocrd.discord.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/usuario")
public class UsuarioControlador {
    @Autowired
    private UsuarioServicio usuarioserv;
    
    
    @GetMapping("/registrar")
    public String registrar() {
        return "formulario.html";
    }
    
    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, @RequestParam String email, @RequestParam String password, @RequestParam String password2) {
        try {
            usuarioserv.crearUsuario(nombre, email, password, password2);
            return "redirect:/";
        } catch (Exception ex) {
            return "formulario.html";
        }
        
        
    }
    
    
}
