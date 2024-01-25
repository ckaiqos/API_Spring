package com.ex.demo.cliente;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int codCliente;
	private String nomeCliente;
	private String cpf;
	private String bairro;
    private String logradouro;
    private String numero;
    private String cep;
    private String cidade;
    private String uf;
    private String numTelefone;
    private String login;
    private String senha;
	public Cliente(int codCliente, String nomeCliente, String cpf, String bairro, String logradouro, String numero,
			String cep, String cidade, String uf, String numTelefone, String login, String senha) {
		super();
		this.codCliente = codCliente;
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
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
	
	
	
	public Cliente() {
		super();
	}



	@JsonCreator
	public Cliente(@JsonProperty("nomeCliente") String nomeCliente, @JsonProperty("cpf") String cpf, 
			@JsonProperty("bairro") String bairro, @JsonProperty("logradouro") String logradouro, 
			@JsonProperty("numero") String numero, @JsonProperty("cep") String cep,
			@JsonProperty("cidade") String cidade, @JsonProperty("uf") String uf, 
			@JsonProperty("numTelefone") String numTelefone, @JsonProperty("login") String login, 
			@JsonProperty("senha") String senha) {
		super();
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
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



	public int getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
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



	@Override
	public String toString() {
		return "Cliente [codCliente=" + codCliente + ", nomeCliente=" + nomeCliente + ", cpf=" + cpf + ", bairro="
				+ bairro + ", logradouro=" + logradouro + ", numero=" + numero + ", cep=" + cep + ", cidade=" + cidade
				+ ", uf=" + uf + ", numTelefone=" + numTelefone + ", login=" + login + ", senha=" + senha + "]";
	}
    
    
    
}
