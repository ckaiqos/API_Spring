package com.ex.demo.administrador;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Administrador {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer codAdministrador;
	
	@Column(name = "nomeAdministrador", 
    		columnDefinition = "VARCHAR(200)")
	
    private String nomeAdministrador;
	
	@Column(name = "login", 
			nullable = false,
    		columnDefinition = "VARCHAR(80)")
	
    private String login;
    
    @Column(name = "senha", 
    		nullable = false,
    		columnDefinition = "CHAR(80)")
    
    private String senha;
    
    
	public Administrador(Integer codAdministrador, String nomeAdministrador, String login, String senha) {
		super();
		this.codAdministrador = codAdministrador;
		this.nomeAdministrador = nomeAdministrador;
		this.login = login;
		this.senha = senha;
	}


	public Integer getCodAdministrador() {
		return codAdministrador;
	}


	public void setCodAdministrador(Integer codAdministrador) {
		this.codAdministrador = codAdministrador;
	}


	public String getNomeAdministrador() {
		return nomeAdministrador;
	}


	public void setNomeAdministrador(String nomeAdministrador) {
		this.nomeAdministrador = nomeAdministrador;
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


	public Administrador(String nomeAdministrador, String login, String senha) {
		super();
		this.nomeAdministrador = nomeAdministrador;
		this.login = login;
		this.senha = senha;
	}


	@Override
	public String toString() {
		return "Administrador [codAdministrador=" + codAdministrador + ", nomeAdministrador=" + nomeAdministrador
				+ ", login=" + login + ", senha=" + senha + "]";
	}
    
    
    
}
