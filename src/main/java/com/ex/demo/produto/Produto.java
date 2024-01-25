package com.ex.demo.produto;

import java.util.List;

import com.ex.demo.vendedor.Vendedor;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Produto {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int CodProduto;
	private String nomeProduto;
	private float valorProduto;  
	private int numExemplar;
	@ManyToOne
	@JoinColumn(name = "codVendedor")
	private Vendedor vendedor;
	
	
	@JsonBackReference
	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Produto() {
		super();
	}

	@JsonCreator
	public Produto(@JsonProperty("nomeProduto") String nomeProduto, @JsonProperty("valorProduto") float valorProduto, @JsonProperty("numExemplar") int numExemplar, @JsonProperty("vendedor") Vendedor vendedor) {
		super();
		this.nomeProduto = nomeProduto;
		this.valorProduto = valorProduto;
		this.numExemplar = numExemplar;
		this.vendedor = vendedor;
	}

	public int getCodProduto() {
		return CodProduto;
	}

	public void setCodProduto(int codProduto) {
		this.CodProduto = codProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public float getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(float valorProduto) {
		this.valorProduto = valorProduto;
	}

	public int getNumExemplar() {
		return numExemplar;
	}

	public void setNumExemplar(int numExemplar) {
		this.numExemplar = numExemplar;
	}

	
	
	
	
	
}
