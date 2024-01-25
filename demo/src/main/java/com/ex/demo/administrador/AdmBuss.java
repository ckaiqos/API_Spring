package com.ex.demo.administrador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
@Service
public class AdmBuss {
	private final AdmRep admrep;
	@Autowired
	public AdmBuss(AdmRep admrep) {this.admrep=admrep;}
	
	public List<Administrador> foi() {
		return admrep.findAll();
			}
}
