/**
 * 
 */
package com.example.junit.junit.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.junit.junit.entity.Usuario;
import com.example.junit.junit.service.UsuarioService;

/**
 * @author ErwinDeLeon
 *
 */
@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Override
	public String login(String user, String pass) {
		// TODO Auto-generated method stub
		if(user.equals("admin") && pass.equals("admin")) {
			return "Login exitoso";
		}
		return "Login Fallido";
	}

	@Override
	public Usuario obtenerUsuarioPorId(String Id) {
		// TODO Auto-generated method stub		
		if(Id.equals("admin")) {
			Usuario u = new Usuario("admin","admin");
			return u;
		}
		return null;
	}

	@Override
	public List<Usuario> listarUsuarios() {
		// TODO Auto-generated method stub
		List<Usuario> lstUser = new ArrayList<Usuario>();
		Usuario u1 = new Usuario("admin1","admin1");
		Usuario u2 = new Usuario("admin2","admin2");
		Usuario u3 = new Usuario("admin3","admin3");
		
		lstUser.add(u1);
		lstUser.add(u2);
		lstUser.add(u3);
		return lstUser;
	}

}
