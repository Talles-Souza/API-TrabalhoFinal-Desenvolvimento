package com.residencia.commerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.commerce.entities.Cliente;
import com.residencia.commerce.repositories.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	ClienteRepository clienteRepository;
	
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}
	
	public Cliente findById(Integer id) {
		return clienteRepository.findById(id).isPresent() ? clienteRepository.findById(id).get() : null;
	}
	
	public Cliente save(Cliente Cliente) {
		return clienteRepository.save(Cliente);
	}
	
	public Cliente update(Cliente Cliente) {
		return clienteRepository.save(Cliente);
	}
	
	public void delete(Cliente Cliente) {
		clienteRepository.delete(Cliente);
	}

	public void deletePorId(Integer id) {
		clienteRepository.deleteById(id);
	}
	
}
