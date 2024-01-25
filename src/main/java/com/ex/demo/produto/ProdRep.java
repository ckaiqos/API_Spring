package com.ex.demo.produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProdRep extends JpaRepository<Produto, Integer> {

}
