package com.uisrael.TallerSemana8.services;

import java.util.List;

import com.uisrael.TallerSemana8.model.Cliente;

public interface IClienteServices {
	public boolean insertarCliente(Cliente nCliente);
	public List<Cliente> listarCliente ();
}
