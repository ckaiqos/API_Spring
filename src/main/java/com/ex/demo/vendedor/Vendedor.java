package com.ex.demo.vendedor;

import java.util.List;

import com.ex.demo.produto.Produto;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table
public class Vendedor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int codVendedor;
	private String nomeVendedor;
	private String cnpj;
	private String bairro;
    private String logradouro;
    private String numero;
    private String cep;
    private String cidade;
    private String uf;
    private String numTelefone;
    private String login;
    private String senha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vendedor")
    private List<Produto> produtos;
    
    
    @JsonManagedReference
	public List<Produto> getProdutos() {
		return produtos;
	}



	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}



	public Vendedor(Integer codVendedor, String nomeVendedor, String cnpj, String bairro, String logradouro,
			String numero, String cep, String cidade, String uf, String numTelefone, String login, String senha) {
		super();
		this.codVendedor = codVendedor;
		this.nomeVendedor = nomeVendedor;
		this.cnpj = cnpj;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
		this.numTelefone = numTelefone;
		this.login = login;
		this.senha = senha;
	}
	
	
	
	public Vendedor() {
		super();
	}



	@JsonCreator
	public Vendedor(@JsonProperty("nomeVendedor") String nomeVendedor,@JsonProperty("cnpj") String cnpj, @JsonProperty("bairro") String bairro, 
			@JsonProperty("logradouro") String logradouro, 
			@JsonProperty("numero") String numero, @JsonProperty("cep") String cep,
			@JsonProperty("cidade") String cidade, @JsonProperty("uf") String uf, 
			@JsonProperty("numTelefone") String numTelefone,  @JsonProperty("login") String login, 
			@JsonProperty("senha") String senha, @JsonProperty("produtos") List<Produto> produtos) {
		super();
		this.nomeVendedor = nomeVendedor;
		this.cnpj = cnpj;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
		this.numTelefone = numTelefone;
		this.login = login;
		this.senha = senha;
		this.produtos = produtos;
	}

	

	public Integer getCodVendedor() {
		return codVendedor;
	}
	public void setCodVendedor(Integer codVendedor) {
		this.codVendedor = codVendedor;
	}
	public String getNomeVendedor() {
		return nomeVendedor;
	}
	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getNumTelefone() {
		return numTelefone;
	}
	public void setNumTelefone(String numTelefone) {
		this.numTelefone = numTelefone;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
    
    
    
}
