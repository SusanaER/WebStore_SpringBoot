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

import com.ws.models.ClientsModel;
import com.ws.repositories.ClientInterface;

@RestController
@RequestMapping("/client")
public class ClientController {
	@Autowired
	private ClientInterface ClientInterface;
	
	@GetMapping
	public List<ClientsModel> ClientsModel(){
		return (List<ClientsModel>) ClientInterface.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Optional<ClientsModel> getByClientsModel(@PathVariable("id")Integer id) {
		return (Optional<ClientsModel>) ClientInterface.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<ClientsModel>  insertClientsModel(@RequestBody ClientsModel article) throws ServerException {
		ClientInterface.save(article);
		if (article == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }
	}
	
	@PutMapping
	public ResponseEntity<ClientsModel> updateClientsModel(@RequestBody ClientsModel article) throws ServerException {
		ClientInterface.save(article);
		if (article == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Integer> deleteClientsModel(@PathVariable("id")Integer id) {
		ClientInterface.deleteById(id);
		return new ResponseEntity<>(id, HttpStatus.OK);
	}
}
