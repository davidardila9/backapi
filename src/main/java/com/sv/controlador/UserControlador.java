package com.sv.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sv.modelos.users;
import com.sv.repositorio.InterfaceUsuario;

@RestController
@RequestMapping ("/users")
public class UserControlador {
	
	@Autowired
	private InterfaceUsuario interfaceUser;

	@GetMapping
	public List<users> users()
	
	{
		return (List<com.sv.modelos.users>) interfaceUser.findAll();
	}
}
