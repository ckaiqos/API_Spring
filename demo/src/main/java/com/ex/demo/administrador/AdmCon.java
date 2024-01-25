package com.ex.demo.administrador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api")
public class AdmCon {
	
	private final AdmBuss admbuss;
	@Autowired
	public AdmCon(AdmBuss admbuss) {
		this.admbuss = admbuss;
	}



	@GetMapping
	public List<Administrador> foi() {return admbuss.foi();}
}
