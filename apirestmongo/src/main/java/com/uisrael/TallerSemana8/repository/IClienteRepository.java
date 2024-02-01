package com.uisrael.TallerSemana8.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.uisrael.TallerSemana8.model.Cliente;

public interface IClienteRepository extends MongoRepository< Cliente, String> {

}
