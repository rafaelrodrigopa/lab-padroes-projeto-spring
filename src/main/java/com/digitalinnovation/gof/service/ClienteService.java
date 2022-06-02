package com.digitalinnovation.gof.service;

import com.digitalinnovation.gof.model.Cliente;

/***
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com isso, se necessário, podemos ter
 * multiplas implementações dessa mesma interface.
 * @author rafaelrodrigopa
 */

public interface ClienteService {

	Iterable<Cliente> buscarTodos();
	
	Cliente buscarPorId(Long id);
	
	void inserir(Cliente cliente);
	
	void atualizar(Long id, Cliente cliente);
	
	void deletar(Long id);
	
}
