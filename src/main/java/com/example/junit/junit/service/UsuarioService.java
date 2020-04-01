/**
 * 
 */
package com.example.junit.junit.service;

import java.util.List;

import com.example.junit.junit.entity.Usuario;

/**
 * @author ErwinDeLeon
 *
 */
public interface UsuarioService {

	/**
	 * @param user
	 * @param password
	 * @return
	 */
	public String login(String user, String password);
	
	/**
	 * @param Id
	 * @return
	 */
	public Usuario obtenerUsuarioPorId(String Id);
	
	/**
	 * @return
	 */
	public List<Usuario> listarUsuarios();
}
