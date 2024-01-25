package com.ex.demo.venda;
import java.util.List;
import com.ex.demo.cliente.CliRep;
import com.ex.demo.cliente.Cliente;
import com.ex.demo.produto.ProdRep;
import com.ex.demo.produto.Produto;

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
@RequestMapping(path = "api_venda")
public class VendCon {
	private final VendBuss vendBuss;
	private final CliRep clirep; 
	private final ProdRep prodrep;
	
	@Autowired
	public VendCon(VendBuss vendBuss, CliRep clirep, ProdRep prodrep) {
		this.vendBuss = vendBuss;
		this.clirep = clirep;
		this.prodrep = prodrep;
									  }
	
	@GetMapping("/list")
	public List<Venda> list(){
		return vendBuss.list();
		                             }
	
	@GetMapping("/ven/{id}")
	public Venda pegarven(@PathVariable int id){
		return vendBuss.pegarvend(id);
		                                       }
	@PostMapping("/novo")
	public ResponseEntity<String> vai(@RequestBody Venda vend){
		vendBuss.salvarvend(vend);
		return ResponseEntity.ok("Dados salvos!");  
		                                                      }
	
	@PostMapping("/novo/{idCliente}/{idProduto}")
	public ResponseEntity<String> salvarReferenciando(@PathVariable int idCliente, @PathVariable int idProduto){
		Venda vend = new Venda();
		Cliente cli = clirep.findById(idProduto).orElse(null);
		Produto prod = prodrep.findById(idProduto).orElse(null);
		vend.setcliente(cli);
		vend.setProduto(prod);
		vendBuss.salvarvend(vend);
		return ResponseEntity.ok("Dados salvos!");
																																		}
	
	
	@PostMapping("/novos")
	public ResponseEntity<String> salvarvens(@RequestBody List<Venda> vends){
		vendBuss.salvarvens(vends);
		return ResponseEntity.ok("Dados salvos!");  
														                    }
	
	
	@DeleteMapping(path = "/del/{id}")
	public ResponseEntity<String> apagar(@PathVariable int id){
		vendBuss.apagar(id);
		return ResponseEntity.ok("Dados deletados!"); 
	                                                          }
	
}
