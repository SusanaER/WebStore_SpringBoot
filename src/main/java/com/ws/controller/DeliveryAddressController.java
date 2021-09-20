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

import com.ws.models.DeliveryAddressModel;
import com.ws.repositories.DeliveryAddressInterface;

@RestController
@RequestMapping("/deliveryAddress")
public class DeliveryAddressController {
	@Autowired
	private DeliveryAddressInterface DeliveryAddressInterface;
	
	@GetMapping
	public List<DeliveryAddressModel> DeliveryAddressModel(){
		return (List<DeliveryAddressModel>) DeliveryAddressInterface.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Optional<DeliveryAddressModel> getByDeliveryAddressModel(@PathVariable("id")Integer id) {
		return (Optional<DeliveryAddressModel>) DeliveryAddressInterface.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<DeliveryAddressModel> insertDeliveryAddressModel(@RequestBody DeliveryAddressModel article) throws ServerException {
		DeliveryAddressInterface.save(article);
		if (article == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }
	}
	
	@PutMapping
	public ResponseEntity<DeliveryAddressModel> updateDeliveryAddressModel(@RequestBody DeliveryAddressModel article) throws ServerException {
		DeliveryAddressInterface.save(article);
		if (article == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Integer> deleteDeliveryAddressModel(@PathVariable("id")Integer id) {
		DeliveryAddressInterface.deleteById(id);
		return new ResponseEntity<>(id, HttpStatus.OK);
	}
}
