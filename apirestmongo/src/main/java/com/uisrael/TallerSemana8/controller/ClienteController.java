package com.uisrael.TallerSemana8.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.TallerSemana8.model.Cliente;
import com.uisrael.TallerSemana8.services.impl.ClienteServiceImpl;

@RestController
@RequestMapping("api/clientes")
public class ClienteController {

	@Autowired
	private ClienteServiceImpl clienteService;
	
	@GetMapping("/listado")
	public List<Cliente> obtenerClientes(){
		return clienteService.listarCliente();
	}
	
	@PostMapping("/insertar")
	@ResponseStatus(HttpStatus.OK)
	public void crearCliente(@RequestBody Cliente c) {
		clienteService.insertarCliente(c);
	}
	
	@PutMapping("/actualizar")
	@ResponseStatus(HttpStatus.OK)
	public boolean actualizarCliente(@RequestBody Cliente c) {
		return clienteService.actualizarCliente(c);
	}
	
	@DeleteMapping("/eliminar-{id}")
	@ResponseStatus(HttpStatus.OK)
	public void eliminarCliente(@PathVariable String id) {
		clienteService.eliminarCliente(id);
	}
	
}
