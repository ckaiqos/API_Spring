package com.ex.demo.cliente;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class CliBuss {
	private final CliRep clirep;
	@Autowired
	public CliBuss(CliRep clirep){this.clirep = clirep;}
	
	public void salvarCli(Cliente cli) {clirep.save(cli);}
	
	public List<Cliente> salvarClis(List<Cliente> clis){return clirep.saveAll(clis);}
	
	public List<Cliente> list() {return clirep.findAll();}
	
	public Cliente pegarCli(int id){return clirep.findById(id).orElse(null);}

	public void apagar(int codCli) {
		if (clirep.existsById(codCli)){
			
			clirep.deleteById(codCli);
			    
		                              } 
	}
	
	public Cliente updateCli(Cliente cli) {
		Cliente cliNovo = clirep.findById(cli.getCodCliente()).orElse(null);
		cliNovo.setNomeCliente(cli.getNomeCliente());
		cliNovo.setCpf(cli.getCpf());
		cliNovo.setLogin(cli.getLogin());
		cliNovo.setSenha(cli.getSenha());
		cliNovo.setUf(cli.getUf());
		cliNovo.setCidade(cli.getCidade());
		cliNovo.setBairro(cli.getBairro());
		cliNovo.setLogradouro(cli.getLogradouro());
		cliNovo.setNomeCliente(cli.getNomeCliente());
		cliNovo.setCep(cli.getCep());
		cliNovo.setNumTelefone(cli.getNumTelefone());
		return clirep.save(cliNovo);
	}	
		
	
	
}
