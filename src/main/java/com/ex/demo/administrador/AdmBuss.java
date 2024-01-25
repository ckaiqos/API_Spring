package com.ex.demo.administrador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AdmBuss {
	private final AdmRep admrep;
	@Autowired
	public AdmBuss(AdmRep admrep){this.admrep = admrep;}
	
	public void salvarAdm(Administrador adm) {admrep.save(adm);}
	
	public List<Administrador> salvarAdms(List<Administrador> adms){return admrep.saveAll(adms);}
	
	public List<Administrador> list() {return admrep.findAll();}
	
	public Administrador pegarAdm(int id){return admrep.findById(id).orElse(null);}

	public void apagar(int codAdm) {
		if (admrep.existsById(codAdm)){
			
			admrep.deleteById(codAdm);
			    
		                              } 
	}
	
	public Administrador updateAdm(Administrador adm) {
		Administrador admNovo = admrep.findById(adm.getCodAdministrador()).orElse(null);
		admNovo.setLogin(adm.getLogin());
		admNovo.setNomeAdministrador(adm.getNomeAdministrador());
		admNovo.setSenha(adm.getSenha());
		return admrep.save(admNovo);
	}	
		
	
}
