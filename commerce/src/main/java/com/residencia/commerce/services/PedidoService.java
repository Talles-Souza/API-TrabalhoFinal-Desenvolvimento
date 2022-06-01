package com.residencia.commerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.commerce.entity.Pedido;
import com.residencia.commerce.repositories.PedidoRepository;

@Service
public class PedidoService {
	@Autowired
	PedidoRepository pedidoRepository;
	
	public List<Pedido> findAllPedido() {
		return pedidoRepository.findAll();
	}
	
	public Pedido findByIdPedido(Integer id) {
		return pedidoRepository.findById(id).isPresent() ? pedidoRepository.findById(id).get() : null;
	}
	
	public Pedido savePedido(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}
	
	public Pedido updatePedido(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}
	
	public void deletePedido(Pedido pedido) {
		pedidoRepository.delete(pedido);
	}

	public void deletePedidoPorId(Integer id) {
		pedidoRepository.deleteById(id);
	}

}
