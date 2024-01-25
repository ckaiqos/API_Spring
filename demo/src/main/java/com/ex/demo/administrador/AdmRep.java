package com.ex.demo.administrador;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AdmRep extends JpaRepository<Administrador, Integer>{

}
