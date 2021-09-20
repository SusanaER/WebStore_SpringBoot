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

import com.ws.models.BillingModel;
import com.ws.repositories.BillingInterface;

@RestController
@RequestMapping("/billing")
public class BillingController {
	@Autowired
	private BillingInterface BillingInterface;
	
	@GetMapping
	public List<BillingModel> BillingModel(){
		return (List<BillingModel>) BillingInterface.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Optional<BillingModel> getByBillingModel(@PathVariable("id")Integer id) {
		return (Optional<BillingModel>) BillingInterface.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<BillingModel> insertBillingModel(@RequestBody BillingModel article) throws ServerException {
		BillingInterface.save(article);
		if (article == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }
	}
	
	@PutMapping
	public ResponseEntity<BillingModel> updateBillingModel(@RequestBody BillingModel article) throws ServerException {
		BillingInterface.save(article);
		if (article == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Integer> deleteBillingModel(@PathVariable("id")Integer id) {
		BillingInterface.deleteById(id);
		return new ResponseEntity<>(id, HttpStatus.OK);
	}
}
