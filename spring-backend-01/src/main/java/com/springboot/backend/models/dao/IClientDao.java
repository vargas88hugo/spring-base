package com.springboot.backend.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.springboot.backend.models.entity.Client;

public interface IClientDao extends CrudRepository<Client, Long> {
	
}
