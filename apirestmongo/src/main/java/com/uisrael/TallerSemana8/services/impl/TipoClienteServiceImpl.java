package com.uisrael.TallerSemana8.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.TallerSemana8.model.TipoCliente;
import com.uisrael.TallerSemana8.repository.ITipoClienteRepository;
import com.uisrael.TallerSemana8.services.ITipoClienteServices;

@Service
public class TipoClienteServiceImpl implements ITipoClienteServices{
	
	@Autowired
	private ITipoClienteRepository repo;
	
	@Override
	public void insertarTipo(TipoCliente nTipoCliente) {
		// TODO Auto-generated method stub
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

}
