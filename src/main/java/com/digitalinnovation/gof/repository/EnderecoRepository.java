package com.digitalinnovation.gof.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digitalinnovation.gof.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Long, Endereco> {

}
