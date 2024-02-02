package com.uisrael.TallerSemana8.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.TallerSemana8.model.TipoCliente;
import com.uisrael.TallerSemana8.repository.ITipoClienteRepository;
import com.uisrael.TallerSemana8.services.ITipoClienteServices;

@Service
public class TipoClienteServiceImpl implements ITipoClienteServices {

	@Autowired
	private ITipoClienteRepository repo;

	@Override
	public void insertarTipo(TipoCliente nTipoCliente) {
		try {
			repo.save(nTipoCliente);
		} catch (Exception e) {
			System.out.println("Tipo de cliente no insertado" + e);
		}
	}

	@Override
	public List<TipoCliente> listarTipo() {
		try {
			return repo.findAll();
		} catch (Exception e) {
			System.out.println("Tipo de cliente no listado" + e);
		}
		return null;
	}

	@Override
	public boolean actualizarTipo(TipoCliente t) {

		return repo.save(t) != null;
	}

	@Override
	public void eliminarTipo(String id) {
		try {
			repo.deleteById(id);
		} catch (Exception e) {
			System.out.println("Error al eliminar Tipo de cliente " + e);
		}
	}

}
