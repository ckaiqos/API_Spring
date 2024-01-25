package com.ex.demo.produto;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdBuss {
	private final ProdRep prodrep;
	@Autowired
	public ProdBuss(ProdRep prodrep) {this.prodrep = prodrep;}
	
	public void salvarProd(Produto prod) {prodrep.save(prod);}
	
	public List<Produto> salvarProds(List<Produto> prods){return prodrep.saveAll(prods);}
	
	public List<Produto> list() {return prodrep.findAll();}
	
	public Produto pegarProd(int id){return prodrep.findById(id).orElse(null);}

	public void apagar(int codProd) {
		if (prodrep.existsById(codProd)){
			
			prodrep.deleteById(codProd);
			    
		                              } 
	}
	
	public Produto updateProd(Produto prod) {
		Produto prodNovo = prodrep.findById(prod.getCodProduto()).orElse(null);
		prodNovo.setNomeProduto(prod.getNomeProduto());
		return prodrep.save(prodNovo);
	}	
}
