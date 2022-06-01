package com.residencia.commerce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.residencia.commerce.entity.Cliente;
import com.residencia.commerce.services.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> findAllCliente(){
		List<Cliente> cliente = clienteService.findAllCliente();
		return new ResponseEntity<>(clienteService.findAllCliente(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> findByIdCliente(@PathVariable Integer id){
		Cliente cliente = clienteService.findByIdCliente(id);
		return new ResponseEntity<>(clienteService.findByIdCliente(id), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Cliente> saveCliente(@RequestBody Cliente cliente){
		return new ResponseEntity<>(clienteService.saveCliente(cliente), HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Cliente> updateCliente(@RequestBody Cliente cliente){
		return new ResponseEntity<>(clienteService.updateCliente(cliente), HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<String> deleteCliente(@PathVariable Integer id){
		Cliente cliente = clienteService.findByIdCliente(id);
		clienteService.deleteClientePorId(id);
		return new ResponseEntity<>("Deletado com sucesso", HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteClientePorId(@PathVariable Integer id){
		Cliente cliente = clienteService.findByIdCliente(id);
		clienteService.deleteClientePorId(id);
		return new ResponseEntity<>("Deletado com sucesso", HttpStatus.OK);
	}
	
	
}
