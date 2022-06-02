package com.digitalinnovation.gof.service.impl;

import org.springframework.stereotype.Service;

import com.digitalinnovation.gof.model.Cliente;
import com.digitalinnovation.gof.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

	// TODO Singleton: Injetar os componentes do Spring com @Autowired.
	// TODO Strategy: Implementar os métodos definidos na interface.
	// TODO Facade: Abstrair integrações com subsistemas, provendo uma interface simples
	
	@Override
	public Iterable<Cliente> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente buscarPorId(Long id) {
		// TODO Buscar cliente por ID.
		return null;
	}

	@Override
	public void inserir(Cliente cliente) {
		// FIXME Verificar se o Endereco do Cliente já existe (pelo CEP)
		// FIXME Caso não exista, integrar com o ViaCEP e persistir o retorno.
		// FIXME Inserir Cliente, vinculando o Endereco (novo ou existente).
	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
		// FIXME Buscar Cliente por ID, caso exista:
		// FIXME Verificar se o Endereco do Cliente já existe (pelo CEP).
		// FIXME Caso não exista, integrar com o ViaCEP e persistir o retorno.
		// FIXME Alterar Cliente, vinculando o Endereco (novo ou existente).
		
	}

	@Override
	public void deletar(Long id) {
		// FIXME Deletar Cliente por id
		
	}

}
