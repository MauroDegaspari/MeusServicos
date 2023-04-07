package oi.github.maurodegaspari.meusservicos.controller;

import org.springframework.data.domain.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	@CrossOrigin("http://localhost:4200")
								//RequestBody para indicar que virar um objeto Json da requisição 
	public ClienteModel salvar(@RequestBody ClienteModel cliente) {
		return clienteRepo.save(cliente);
	}
	
	@GetMapping("{id}")
	public ClienteModel findClienteId(@PathVariable Long id) {
		return clienteRepo
				.findById(id)
				.orElseThrow( ()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
	@GetMapping("/todos")
	public List<ClienteModel> todosClientesFind(Pageable pageable){
		return clienteRepo.findAll();
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void excluirCLiente(@PathVariable Long id) {
		clienteRepo
		.findById(id)
		.map( cliente ->{
			clienteRepo.delete(cliente);
			return Void.TYPE;
		})
		.orElseThrow( ()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
	@PutMapping("{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void atualizarCliente(@PathVariable Long id, @RequestBody ClienteModel clienteAtualizado) {
		clienteRepo
		    .findById(id)
		    .map( cliente ->{
		    	cliente.setNome_cliente(clienteAtualizado.getNome_cliente());
		    	cliente.setCpf(clienteAtualizado.getCpf());
		    	return clienteRepo.save(cliente);
		    })
		    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT));
	}
	
	
}
