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

import com.ws.models.ClientCreditCardModel;
import com.ws.repositories.ClientCreditCardInterface;

@RestController
@RequestMapping("/ClientCreditCard")
public class ClientCreditCardController {
	@Autowired
	private ClientCreditCardInterface ClientCreditCardInterface;
	
	@GetMapping
	public List<ClientCreditCardModel> ClientCreditCardModel(){
		return (List<ClientCreditCardModel>) ClientCreditCardInterface.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Optional<ClientCreditCardModel> getByClientCreditCardModel(@PathVariable("id")Integer id) {
		return (Optional<ClientCreditCardModel>) ClientCreditCardInterface.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<ClientCreditCardModel> insertClientCreditCardModel(@RequestBody ClientCreditCardModel article) throws ServerException {
		ClientCreditCardInterface.save(article);
		if (article == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }
	}
	
	@PutMapping
	public ResponseEntity<ClientCreditCardModel> updateClientCreditCardModel(@RequestBody ClientCreditCardModel article) throws ServerException {
		ClientCreditCardInterface.save(article);
		if (article == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Integer> deleteClientCreditCardModel(@PathVariable("id")Integer id) {
		ClientCreditCardInterface.deleteById(id);
		return new ResponseEntity<>(id, HttpStatus.OK);
	}
}
