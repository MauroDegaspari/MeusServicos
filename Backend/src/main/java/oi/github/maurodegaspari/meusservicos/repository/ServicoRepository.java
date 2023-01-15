package oi.github.maurodegaspari.meusservicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import oi.github.maurodegaspari.meusservicos.model.ServicosModel;

public interface ServicoRepository extends JpaRepository<ServicosModel, Integer>{

}
