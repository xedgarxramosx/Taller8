package com.uisrael.TallerSemana8.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.TallerSemana8.model.Cliente;
import com.uisrael.TallerSemana8.repository.IClienteRepository;
import com.uisrael.TallerSemana8.services.IClienteServices;

@Service
public class ClienteServiceImpl implements IClienteServices{
	@Autowired
	private IClienteRepository repo;
	
	@Override
	public boolean insertarCliente(Cliente nCliente) {
		// TODO Auto-generated method stub
		return repo.save(nCliente)!= null;
	}

	@Override
	public List<Cliente> listarCliente() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
}
