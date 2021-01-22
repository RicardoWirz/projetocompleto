package com.ricardolima.projetocompleto.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardolima.projetocompleto.domain.Cliente;
import com.ricardolima.projetocompleto.repositories.ClienteRepository;
import com.ricardolima.projetocompleto.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! id: " + id +", Tipo: " + Cliente.class.getName()));


	}
}
