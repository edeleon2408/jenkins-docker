package com.example.junit.junit;

//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.runners.MockitoJUnitRunner;

//import com.example.junit.junit.service.UsuarioService;

//@RunWith(MockitoJUnitRunner.class)
public class JunitApplicationTests {

	//@InjectMocks
	//UsuarioService usuarioService;
	
	@Before
	public void init() {
		System.out.println("Metodo para instanciar Objetos");
		//Comportamientos predecibles de la dependencia
		//when("").thenReturn("");
	}
	
	@Test
	public void listarUsuarios() {
		//usuarioService.listarUsuarios();
		//verify(usuarioService).listarUsuarios();
	}
	
}
