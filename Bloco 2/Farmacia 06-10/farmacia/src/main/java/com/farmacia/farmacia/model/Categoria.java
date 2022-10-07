package com.farmacia.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categorias")
public class Categoria {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@NotNull(message = "O atributo Descrição é obrigatório")
private String descricao;
public Long getId() {
	return id;
}

@OneToMany(mappedBy = "categoria", cascade = CascadeType.REMOVE)
@JsonIgnoreProperties("categoria")
private List<Produto> produto;

public void setId(Long id) {
	this.id = id;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public void setProduto(List<Produto> produto) {
	this.produto = produto;
}



}