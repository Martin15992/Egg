
package com.ejemplosdisocrd.discord.repositorios;

import com.ejemplosdisocrd.discord.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, String> {
    
    
}
