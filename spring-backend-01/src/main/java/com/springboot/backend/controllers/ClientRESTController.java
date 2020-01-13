package com.springboot.backend.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
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
}
