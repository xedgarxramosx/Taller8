package com.uisrael.TallerSemana8.services;

import java.util.List;

import com.uisrael.TallerSemana8.model.TipoCliente;

public interface ITipoClienteServices {
	public void insertarTipo(TipoCliente nTipoCliente);
	
	public List<TipoCliente> listarTipo();
	
	public boolean actualizarTipo(TipoCliente t);
	
	public void eliminarTipo(String id);
}
