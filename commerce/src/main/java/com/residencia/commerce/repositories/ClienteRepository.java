package com.residencia.commerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.residencia.commerce.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

}
