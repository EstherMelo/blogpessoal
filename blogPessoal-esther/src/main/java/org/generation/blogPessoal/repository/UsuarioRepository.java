package org.generation.blogPessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

import org.generation.blogPessoal.model.Usuario;


public interface UsuarioRepository  extends JpaRepository<Usuario, Long> {
	
	public Optional<Usuario> findByUsuario(String usuario);
}
