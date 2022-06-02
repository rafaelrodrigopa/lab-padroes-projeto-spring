package com.digitalinnovation.gof.repository;

import org.springframework.data.repository.CrudRepository;

import com.digitalinnovation.gof.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
