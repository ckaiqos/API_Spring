package com.ex.demo.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CliRep extends JpaRepository<Cliente, Integer> {

}
