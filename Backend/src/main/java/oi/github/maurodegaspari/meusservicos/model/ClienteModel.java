package oi.github.maurodegaspari.meusservicos.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="cliente")
public class ClienteModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_cliente")
	@SequenceGenerator(name="seq_cliente", allocationSize = 1)
	@Column(name = "cd_cliente", nullable = false)
	private int codigo_cliente;

	@Column(name="nm_cliente", nullable = false)
	private String nome_cliente;
	
	@Column(name="cpf", nullable = false)
	private int cpf;
	
	@Column(name="dt_cadastro")
	@JsonFormat(pattern = "dd/mm/yyyy")
	private LocalDate data;

		
	public ClienteModel() {
		
	}

	@PrePersist
	public void prePersist() {
		setData(LocalDate.now());
	}
	
	public int getCodigo_cliente() {
		return codigo_cliente;
	}

	public void setCodigo_cliente(int codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	

}
