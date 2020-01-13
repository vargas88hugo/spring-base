package com.springboot.backend.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.springboot.backend.models.entity.Client;
import com.springboot.backend.models.services.IClientService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ClientRESTController {

	@Autowired
	private IClientService clientService;
	
	@GetMapping("/clients")
	public List<Client> index() {
		return clientService.findAll();
	}
	
	@GetMapping("/clients/{id}")
	// @ResponseStatus(HttpStatus.OK) It is by default
	public Client show(@PathVariable Long id) {
		return clientService.findById(id);
	}
	
	@PostMapping("/clients")
	@ResponseStatus(HttpStatus.CREATED) 
	public Client create(@RequestBody Client client) {
		return clientService.save(client);
	}
	
	@PutMapping("/clients/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Client update(@RequestBody Client client, @PathVariable Long id) {
		Client currentClient = clientService.findById(id);
		
		currentClient.setLastName(client.getLastName());
		currentClient.setFirstName(client.getFirstName());
		currentClient.setEmail(client.getEmail());
		
		return clientService.save(currentClient);
	}
	
	@DeleteMapping("/clients/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		clientService.delete(id);
	}
}
