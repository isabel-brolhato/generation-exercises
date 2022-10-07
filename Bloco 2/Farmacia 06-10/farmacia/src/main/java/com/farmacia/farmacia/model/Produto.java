package com.farmacia.farmacia.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos")
public class Produto {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 
  @NotBlank(message = "O atributo nome é obrigatório.")
  @Size
  private String nome;
  
  @NotNull
  private BigDecimal valor;
  
  @NotBlank(message = "O atributo marca é obrigatório.")
  @Size
  private String marca;
  
  @ManyToOne
  @JsonIgnoreProperties("produto")
  private Categoria categoria;
  

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public BigDecimal getValor() {
	return valor;
}

public void setValor(BigDecimal valor) {
	this.valor = valor;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}
	
 public void setCategoria(Categoria categoria) {
	 this.categoria = categoria;
 }
	
}
