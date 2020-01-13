package com.springboot.backend.models.services;

import java.util.*	;
import com.springboot.backend.models.entity.Client;

public interface IClientService {

	public List<Client> findAll();
	
	public Client findById(Long id);
	
	public Client save(Client client);
	
	public void delete(Long id);
}
