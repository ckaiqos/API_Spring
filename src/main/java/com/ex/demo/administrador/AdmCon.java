package com.ex.demo.administrador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api_adm")
public class AdmCon {
	
	private final AdmBuss admbuss;
	@Autowired
	public AdmCon(AdmBuss admbuss) {
		this.admbuss = admbuss;
	}

	@GetMapping("/list")
	public List<Administrador> list(){
		return admbuss.list();
		                             }
	
	@GetMapping("/adm/{id}")
	public Administrador pegarAdm(@PathVariable int id){
		return admbuss.pegarAdm(id);
		                                               }
	@PostMapping("/novo")
	public ResponseEntity<String> vai(@RequestBody Administrador adm){
		admbuss.salvarAdm(adm);
		return ResponseEntity.ok("Dados salvos!");
		                                           }
	@PostMapping("/novos")
	public ResponseEntity<String> salvaradms(@RequestBody List<Administrador> adms){
		admbuss.salvarAdms(adms);
		return ResponseEntity.ok("Dados salvos!");
														}
	
	
	@DeleteMapping(path = "/del/{id}")
	public ResponseEntity<String> apagar(@PathVariable int id){
		admbuss.apagar(id);
		return ResponseEntity.ok("Dados deletados!"); 
	                                        }
	
	@PutMapping("/update")
	public ResponseEntity<String> updateAdm(@RequestBody Administrador adm){
		admbuss.updateAdm(adm);
		return ResponseEntity.ok("Dados salvos!");
	                                                              }
	
}
