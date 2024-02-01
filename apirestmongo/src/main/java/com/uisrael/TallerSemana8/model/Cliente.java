package com.uisrael.TallerSemana8.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
@Document(collection = "cliente")
@Getter
@Setter
public class Cliente {

	@Id
	private String cliCodigo;
	private String cliCliente;
	private String cliCi;
	private String cliDireccion;
	private String cliTelefono;
	private String cliEmail;
	
	@DBRef
	private TipoCliente tipoCliente;
}
