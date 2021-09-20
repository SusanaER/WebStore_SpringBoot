package com.ws.controller;

import java.rmi.ServerException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ws.models.ClientDelAddModel;
import com.ws.repositories.ClientDelAddInterface;

@RestController
@RequestMapping("/ClientDelAdd")
public class ClientDelAddController {
	@Autowired
	private ClientDelAddInterface ClientDelAddInterface;
	
	@GetMapping
	public List<ClientDelAddModel> ClientDelAddModel(){
		return (List<ClientDelAddModel>) ClientDelAddInterface.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Optional<ClientDelAddModel> getByClientDelAddModel(@PathVariable("id")Integer id) {
		return (Optional<ClientDelAddModel>) ClientDelAddInterface.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<ClientDelAddModel> insertClientDelAddModel(@RequestBody ClientDelAddModel article) throws ServerException {
		ClientDelAddInterface.save(article);
		if (article == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }
	}
	
	@PutMapping
	public ResponseEntity<ClientDelAddModel> updateClientDelAddModel(@RequestBody ClientDelAddModel article) throws ServerException {
		ClientDelAddInterface.save(article);
		if (article == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Integer> deleteClientDelAddModel(@PathVariable("id")Integer id) {
		ClientDelAddInterface.deleteById(id);
		return new ResponseEntity<>(id, HttpStatus.OK);
	}
}
