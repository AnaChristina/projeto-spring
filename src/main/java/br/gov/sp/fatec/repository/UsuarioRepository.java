package br.gov.sp.fatec.repository;

import org.springframework.data.jpa.repository.JpaRespository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.gov.sp.fatec.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}