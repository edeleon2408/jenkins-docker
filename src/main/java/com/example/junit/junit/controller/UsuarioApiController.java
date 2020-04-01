/**
 * 
 */
package com.example.junit.junit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.junit.junit.entity.Usuario;
import com.example.junit.junit.service.UsuarioService;

/**
 * @author ErwinDeLeon
 *
 */
@RestController
@RequestMapping("/usuario")
public class UsuarioApiController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/login")
	public String login(@RequestParam("user") String user, 
			@RequestParam("password") String password) {		
		return usuarioService.login(user, password);
	}
	
	@GetMapping("/obtener-usuario")
	public Usuario obtenerUsuario(@RequestParam("id") String id) {
		return usuarioService.obtenerUsuarioPorId(id);
	}
	
	@GetMapping("/listar-usuarios")
	public List<Usuario> listarUsuarios(){
		return usuarioService.listarUsuarios();
	}
	
	@GetMapping("/prueba")
	public String prueba() {
		return "Api de prueba";
	}
}
