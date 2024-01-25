package com.ex.demo.venda;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendBuss {
	private final VendRep vendrep;
	@Autowired
	public VendBuss(VendRep vendrep){this.vendrep = vendrep;}
	
	public void salvarvend(Venda vend) {vendrep.save(vend);}
	
	public List<Venda> salvarvens(List<Venda> vends){return vendrep.saveAll(vends);}
	
	public List<Venda> list() {return vendrep.findAll();}
	
	public Venda pegarvend(int id){return vendrep.findById(id).orElse(null);}
	
	public void apagar(int codvend) {
		if (vendrep.existsById(codvend)){
			
			vendrep.deleteById(codvend);
			    
		                              } 

}
}
