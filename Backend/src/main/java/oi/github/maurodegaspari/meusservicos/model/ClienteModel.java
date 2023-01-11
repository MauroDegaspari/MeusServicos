package oi.github.maurodegaspari.meusservicos.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DBAMS.CLIENTES")
public class ClienteModel {
	
	@Id
	@Column(name = "cd_cliente", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_cliente;

	@Column(name="nm_cliente", nullable = false)
	private String nome_cliente;
	
	@Column(name="cpf", nullable = false)
	private String cpf;
	
	@Column(name="dt_cadastro")
	private LocalDate data;
	
	

}
