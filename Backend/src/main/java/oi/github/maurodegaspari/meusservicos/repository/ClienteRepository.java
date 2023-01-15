package oi.github.maurodegaspari.meusservicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import oi.github.maurodegaspari.meusservicos.model.ClienteModel;

public interface ClienteRepository extends JpaRepository<ClienteModel, Integer>{

}
