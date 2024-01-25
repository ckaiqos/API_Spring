package com.ex.demo.venda;
import com.ex.demo.cliente.Cliente;
import com.ex.demo.produto.Produto;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Venda {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int codVenda;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cliente")
	private Cliente cliente;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "produto")
	private Produto produto;
	
	public Venda() {
		super();
	}
	
	
	@JsonCreator
	public Venda(@JsonProperty("cliente") Cliente cliente, @JsonProperty("produto") Produto produto) {
		super();
		this.cliente = cliente;
		this.produto = produto;
	}



	public int getCodVenda() {
		return codVenda;
	}

	public void setCodVenda(int codVenda) {
		this.codVenda = codVenda;
	}


	public Cliente getcliente() {
		return cliente;
	}


	public void setcliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	
	
	
}
