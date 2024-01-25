package com.ex.demo.vendedor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class VenBuss {
	private final VenRep venrep;
	@Autowired
	public VenBuss(VenRep venrep){this.venrep = venrep;}
	
	public void salvarven(Vendedor ven) {venrep.save(ven);}
	
	public List<Vendedor> salvarvens(List<Vendedor> vens){return venrep.saveAll(vens);}
	
	public List<Vendedor> list() {return venrep.findAll();}
	
	public Vendedor pegarven(int id){return venrep.findById(id).orElse(null);}

	public void apagar(int codven) {
		if (venrep.existsById(codven)){
			
			venrep.deleteById(codven);
			    
		                              } 
	}
	
	public Vendedor updateven(Vendedor ven) {
		Vendedor venNovo = venrep.findById(ven.getCodVendedor()).orElse(null);
		venNovo.setNomeVendedor(ven.getNomeVendedor());
		venNovo.setCnpj(ven.getCnpj());
		venNovo.setLogin(ven.getLogin());
		venNovo.setSenha(ven.getSenha());
		venNovo.setUf(ven.getUf());
		venNovo.setCidade(ven.getCidade());
		venNovo.setBairro(ven.getBairro());
		venNovo.setLogradouro(ven.getLogradouro());
		venNovo.setNomeVendedor(ven.getNomeVendedor());
		venNovo.setCep(ven.getCep());
		venNovo.setNumTelefone(ven.getNumTelefone());
		return venrep.save(venNovo);
	}	
}
