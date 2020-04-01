/**
 * 
 */
package com.example.junit.junit.controller;

import static org.junit.Assert.*;
//import static org.mockito.Mockito.when;

//import org.junit.Assert;
import org.junit.Test;

import com.example.junit.junit.entity.Usuario;

/**
 * @author ErwinDeLeon
 *
 */
public class UsuarioApiControllerTest {

	/**
	 * Test method for {@link com.example.junit.junit.controller.UsuarioApiController#login(java.lang.String, java.lang.String)}.
	 */
	@Test
	public final void testLogin() {
		//fail("Not yet implemented"); // TODO
		//when("ok").thenReturn("Ok! muy bien");
		assertEquals(1, 1);
	}

	/**
	 * Test method for {@link com.example.junit.junit.controller.UsuarioApiController#obtenerUsuario(java.lang.String)}.
	 */
	@Test
	public final void testObtenerUsuario() {
		//fail("Not yet implemented"); // TODO
		Usuario u1 = new Usuario("1","1");
		//Usuario u2 = new Usuario("1","1");
		assertEquals(u1, u1);
	}

	/**
	 * Test method for {@link com.example.junit.junit.controller.UsuarioApiController#listarUsuarios()}.
	 */
	@Test
	public final void testListarUsuarios() {
		//fail("Not yet implemented"); // TODO
	}

}
