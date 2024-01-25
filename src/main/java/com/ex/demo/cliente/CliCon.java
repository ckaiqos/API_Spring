package com.ex.demo.cliente;
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
@RequestMapping(path = "api_cli")
public class CliCon {
	private final CliBuss clibuss;
	@Autowired
	public CliCon(CliBuss clibuss) {
		this.clibuss = clibuss;
	}

	@GetMapping("/list")
	public List<Cliente> list(){
		return clibuss.list();
		                             }
	
	@GetMapping("/cli/{id}")
	public Cliente pegarCli(@PathVariable int id){
		return clibuss.pegarCli(id);
		                                         }
	@PostMapping("/novo")
	public ResponseEntity<String> vai(@RequestBody Cliente cli){
		clibuss.salvarCli(cli);
		return ResponseEntity.ok("Dados salvos!");
		                                           			   }
	@PostMapping("/novos")
	public ResponseEntity<String> salvarclis(@RequestBody List<Cliente> clis){
		clibuss.salvarClis(clis);
		return ResponseEntity.ok("Dados salvos!");
																			 }
	
	
	@DeleteMapping(path = "/del/{id}")
	public ResponseEntity<String> apagar(@PathVariable int id){
		clibuss.apagar(id);
		return ResponseEntity.ok("Dados deletados!");
	                                        				  }
	
	@PutMapping("/update")
	public ResponseEntity<String> updateCli(@RequestBody Cliente cli){
		clibuss.updateCli(cli);
		return ResponseEntity.ok("Dados salvos!");
	                                                                 }
}
