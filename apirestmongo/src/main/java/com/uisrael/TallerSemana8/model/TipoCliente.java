package com.uisrael.TallerSemana8.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
@Document(collection = "tipocliente")
@Getter
@Setter
public class TipoCliente {

	@Id
	private String tipCodigo;
	private String tipNombre;
	private Boolean tipEstado;
}
