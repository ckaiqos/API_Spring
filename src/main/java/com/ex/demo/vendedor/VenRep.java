package com.ex.demo.vendedor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface VenRep extends JpaRepository<Vendedor, Integer> {

}
