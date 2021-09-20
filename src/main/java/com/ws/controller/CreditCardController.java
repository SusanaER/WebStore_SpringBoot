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

import com.ws.models.CreditCardModel;
import com.ws.repositories.CreditCardInterface;

@RestController
@RequestMapping("/creditCard")
public class CreditCardController {
	@Autowired
	private CreditCardInterface CreditCardInterface;
	
	@GetMapping
	public List<CreditCardModel> CreditCardModel(){
		return (List<CreditCardModel>) CreditCardInterface.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Optional<CreditCardModel> getByCreditCardModel(@PathVariable("id")Integer id) {
		return (Optional<CreditCardModel>) CreditCardInterface.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<CreditCardModel> insertCreditCardModel(@RequestBody CreditCardModel article) throws ServerException {
		CreditCardInterface.save(article);
		if (article == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }
	}
	
	@PutMapping
	public ResponseEntity<CreditCardModel> updateCreditCardModel(@RequestBody CreditCardModel article) throws ServerException {
		CreditCardInterface.save(article);
		if (article == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Integer> deleteCreditCardModel(@PathVariable("id")Integer id) {
		CreditCardInterface.deleteById(id);
		return new ResponseEntity<>(id, HttpStatus.OK);
	}
}
