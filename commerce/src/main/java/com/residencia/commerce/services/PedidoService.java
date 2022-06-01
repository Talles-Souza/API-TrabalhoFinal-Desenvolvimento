package com.residencia.commerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.commerce.entities.Pedido;
import com.residencia.commerce.repositories.PedidoRepository;

@Service
public class PedidoService {
	@Autowired
	PedidoRepository pedidoRepository;
	
	public List<Pedido> findAll() {
		return pedidoRepository.findAll();
	}
	
	public Pedido findById(Integer id) {
		return pedidoRepository.findById(id).isPresent() ? pedidoRepository.findById(id).get() : null;
	}
	
	public Pedido save(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}
	
	public Pedido update(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}
	
	public void delete(Pedido pedido) {
		pedidoRepository.delete(pedido);
	}

	public void deletePorId(Integer id) {
		pedidoRepository.deleteById(id);
	}

}
