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
import com.uisrael.TallerSemana8.model.TipoCliente;
import com.uisrael.TallerSemana8.services.impl.TipoClienteServiceImpl;

@RestController
@RequestMapping("api/tipos")
public class TipoClienteController {

	@Autowired
	private TipoClienteServiceImpl tipoService;
	
	@GetMapping("/listado")
	@ResponseStatus(HttpStatus.OK)
	public List<TipoCliente> obtenerTipos(){
		return tipoService.listarTipo();
	}
	
	@PostMapping()
	@ResponseStatus(HttpStatus.OK)
	public void crearTipo(@RequestBody TipoCliente tc) {
		tipoService.insertarTipo(tc);
	}
	
	@PutMapping("/actualizar")
	@ResponseStatus(HttpStatus.OK)
	public void actualizarDisciplinas(@RequestBody TipoCliente t) {
		tipoService.actualizarTipo(t);
	}
	
	@DeleteMapping("/eliminar-{id}")
	@ResponseStatus(HttpStatus.OK)
	public void eliminarDisciplinas(@PathVariable String id) {
		tipoService.eliminarTipo(id);
	}
}
