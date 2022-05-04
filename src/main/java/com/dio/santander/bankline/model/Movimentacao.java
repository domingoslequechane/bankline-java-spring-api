package com.dio.santander.bankline.model;

import java.time.LocalDateTime;

import javax.persistence.Column;

// Anotações - classes especiais para a criação de mapeamento para banco de dados

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "table_movimentacao")
public class Movimentacao {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) // Estrategia de geração de chave automatica
	private Integer id;
	
	@Column (name = "data_Hora")
	private LocalDateTime dataHora;
	
	
	private String descricao;
	private Double valor;
	
	@Enumerated (EnumType.STRING)
	private TipoMovimentacao tipo;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}

	public TipoMovimentacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoMovimentacao tipo) {
		this.tipo = tipo;
	}
}
