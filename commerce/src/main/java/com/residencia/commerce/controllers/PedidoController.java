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
import com.residencia.commerce.entity.Pedido;
import com.residencia.commerce.services.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping
	public ResponseEntity<List<Pedido>> findAllPedido(){
		List<Pedido> pedido = pedidoService.findAllPedido();
		return new ResponseEntity<>(pedidoService.findAllPedido(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Pedido> findByIdPedido(@PathVariable Integer id){
		Pedido pedido = pedidoService.findByIdPedido(id);
		return new ResponseEntity<>(pedidoService.findByIdPedido(id), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Pedido> savePedido(@RequestBody Pedido pedido){
		return new ResponseEntity<>(pedidoService.savePedido(pedido), HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Pedido> updatePedido(@RequestBody Pedido pedido){
		return new ResponseEntity<>(pedidoService.updatePedido(pedido), HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<String> deletePedido(@PathVariable Integer id){
		Pedido pedido = pedidoService.findByIdPedido(id);
		pedidoService.deletePedidoPorId(id);
		return new ResponseEntity<>("Deletado com sucesso", HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deletePedidoPorId(@PathVariable Integer id){
		Pedido pedido = pedidoService.findByIdPedido(id);
		pedidoService.deletePedidoPorId(id);
		return new ResponseEntity<>("Deletado com sucesso", HttpStatus.OK);
	}
	
}
