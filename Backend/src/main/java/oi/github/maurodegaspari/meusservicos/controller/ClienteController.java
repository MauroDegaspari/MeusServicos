package oi.github.maurodegaspari.meusservicos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import oi.github.maurodegaspari.meusservicos.model.ClienteModel;
import oi.github.maurodegaspari.meusservicos.repository.ClienteRepository;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepo;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
								//RequestBody para incidar que virar um objeto Json da requisição 
	public ClienteModel salvar(@RequestBody ClienteModel cliente) {
		return clienteRepo.save(cliente);
	}
	
	@GetMapping("{id}")
	public ClienteModel findClienteId(@PathVariable Long id) {
		return clienteRepo
				.findById(id)
				.orElseThrow( ()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void excluirCLiente(@PathVariable Long id) {
		clienteRepo
		.findById(id)
		.map( cliente ->{
			clienteRepo.delete(cliente);
			System.out.println("Cliente deletado com sussa");
			return Void.TYPE;
		})
		.orElseThrow( ()-> new ResponseStatusException(HttpStatus.NOT_FOUND));;
	}
}
