package com.residencia.commerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.commerce.entity.Cliente;
import com.residencia.commerce.repositories.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	ClienteRepository clienteRepository;
	
	public List<Cliente> findAllCliente() {
		return clienteRepository.findAll();
	}
	
	public Cliente findByIdCliente(Integer id) {
		return clienteRepository.findById(id).isPresent() ? clienteRepository.findById(id).get() : null;
	}
	
	public Cliente saveCliente(Cliente Cliente) {
		return clienteRepository.save(Cliente);
	}
	
	public Cliente updateCliente(Cliente Cliente) {
		return clienteRepository.save(Cliente);
	}
	
	public void deleteCliente(Cliente Cliente) {
		clienteRepository.delete(Cliente);
	}

	public void deleteClientePorId(Integer id) {
		clienteRepository.deleteById(id);
	}
	
}
