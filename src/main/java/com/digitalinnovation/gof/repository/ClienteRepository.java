package com.digitalinnovation.gof.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digitalinnovation.gof.model.Cliente;

public interface ClienteRepository extends JpaRepository<Long, Cliente> {

}
