package com.ex.demo.vendedor;
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
@RequestMapping(path = "api_vendedor")
public class VenCon {
	private final VenBuss venBuss;
	@Autowired
	public VenCon(VenBuss venBuss) {
		this.venBuss = venBuss;
	}

	@GetMapping("/list")
	public List<Vendedor> list(){
		return venBuss.list();
		                             }
	
	@GetMapping("/ven/{id}")
	public Vendedor pegarven(@PathVariable int id){
		return venBuss.pegarven(id);
		                                               }
	@PostMapping("/novo")
	public ResponseEntity<String> vai(@RequestBody Vendedor ven){
		venBuss.salvarven(ven);
		return ResponseEntity.ok("Dados salvos!");  
		                                           }
	@PostMapping("/novos")
	public ResponseEntity<String> salvarvens(@RequestBody List<Vendedor> vens){
		venBuss.salvarvens(vens);
		return ResponseEntity.ok("Dados salvos!");  
														}
	
	
	@DeleteMapping(path = "/del/{id}")
	public ResponseEntity<String> apagar(@PathVariable int id){
		venBuss.apagar(id);
		return ResponseEntity.ok("Dados deletados!"); 
	                                        }
	
	@PutMapping("/update")
	public ResponseEntity<String> updateven(@RequestBody Vendedor ven){
		venBuss.updateven(ven);
		return ResponseEntity.ok("Dados salvos!");  
	                                                              }
}
