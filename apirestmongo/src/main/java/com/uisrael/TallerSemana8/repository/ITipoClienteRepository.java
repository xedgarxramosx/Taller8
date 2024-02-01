package com.uisrael.TallerSemana8.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.uisrael.TallerSemana8.model.TipoCliente;

public interface ITipoClienteRepository extends MongoRepository<TipoCliente, String> {

}
