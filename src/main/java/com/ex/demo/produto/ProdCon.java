package com.ex.demo.produto;
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

import com.ex.demo.cliente.Cliente;
import com.ex.demo.venda.Venda;
import com.ex.demo.vendedor.VenRep;
import com.ex.demo.vendedor.Vendedor;

@RestController
@RequestMapping(path = "api_prod")
public class ProdCon {
	private final ProdBuss prodbuss;
	private final VenRep venrep;
	@Autowired
	public ProdCon(ProdBuss prodbuss, VenRep venrep) {this.prodbuss = prodbuss; this.venrep = venrep;}
	
	@GetMapping("/list")
	public List<Produto> list(){return prodbuss.list();}
	
	@GetMapping("/prod/{id}")
	public Produto pegarProd(@PathVariable int id){return prodbuss.pegarProd(id);}
	
	@PostMapping("/novo")
	public ResponseEntity<String> vai(@RequestBody Produto prod){ 
		prodbuss.salvarProd(prod); 
		return ResponseEntity.ok("Dados salvos!");
																}
	
	@PostMapping("/novo/{idVendedor}")
	public ResponseEntity<String> salvarReferenciando(@PathVariable int idVendedor, @RequestBody Produto prod){
		Vendedor ven = venrep.findById(idVendedor).orElse(null);
		prod.setVendedor(ven);
		prodbuss.salvarProd(prod);
		return ResponseEntity.ok("Dados salvos!");
																																		}
	
	@PostMapping("/novos")
	public ResponseEntity<String> salvarProds(@RequestBody List<Produto> prods){
		prodbuss.salvarProds(prods);
		return ResponseEntity.ok("Dados salvos!");
																			   }
	
	@DeleteMapping(path = "/del/{id}")
	public ResponseEntity<String> apagar(@PathVariable int id){ 
		prodbuss.apagar(id); 
		return ResponseEntity.ok("Dados deletados!"); 
															  }
	
	@PutMapping("/update")
	public ResponseEntity<String> updateProd(@RequestBody Produto prod){
		prodbuss.updateProd(prod);
		return ResponseEntity.ok("Dados salvos!");
																	   }
	
}
