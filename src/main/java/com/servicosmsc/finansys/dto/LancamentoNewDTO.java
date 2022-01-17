package com.servicosmsc.finansys.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonFormat;

public class LancamentoNewDTO  implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	private Integer categoria_id;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 5, max = 120, message = "O tamanho deve ser entre 5 e 120 catacteres")
	private String nome;
	private String descricao;
	@NotEmpty(message = "Preenchimento obrigatório")
	private String valor;
	private String tipo;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	private boolean pago;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm")
	private Date data_lancamento;
	
	public LancamentoNewDTO() {}
	
	public LancamentoNewDTO(Integer id, @NotEmpty(message = "Preenchimento obrigatório") Integer categoria_id,
			@NotEmpty(message = "Preenchimento obrigatório") @Length(min = 5, max = 120, message = "O tamanho deve ser entre 5 e 120 catacteres") String nome,
			String descricao, @NotEmpty(message = "Preenchimento obrigatório") String valor, String tipo,
			@NotEmpty(message = "Preenchimento obrigatório") boolean pago, Date data_lancamento) {
		super();
		this.id = id;
		this.categoria_id = categoria_id;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.tipo = tipo;
		this.pago = pago;
		this.data_lancamento = data_lancamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCategoria_id() {
		return categoria_id;
	}

	public void setCategoria_id(Integer categoria_id) {
		this.categoria_id = categoria_id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean getPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	public Date getData_lancamento() {
		return data_lancamento;
	}

	public void setData_lancamento(Date data_lancamento) {
		this.data_lancamento = data_lancamento;
	}

}
