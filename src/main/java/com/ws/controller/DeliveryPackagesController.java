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

import com.ws.models.DeliveryPackagesModel;
import com.ws.repositories.DeliveryPackagesInterface;

@RestController
@RequestMapping("/deliveryPackages")
public class DeliveryPackagesController {
	@Autowired
	private DeliveryPackagesInterface DeliveryPackagesInterface;
	
	@GetMapping
	public List<DeliveryPackagesModel> DeliveryPackagesModel(){
		return (List<DeliveryPackagesModel>) DeliveryPackagesInterface.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Optional<DeliveryPackagesModel> getByDeliveryPackagesModel(@PathVariable("id")Integer id) {
		return (Optional<DeliveryPackagesModel>) DeliveryPackagesInterface.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<DeliveryPackagesModel> insertDeliveryPackagesModel(@RequestBody DeliveryPackagesModel article) throws ServerException {
		DeliveryPackagesInterface.save(article);
		if (article == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }
	}
	
	@PutMapping
	public ResponseEntity<DeliveryPackagesModel> updateDeliveryPackagesModel(@RequestBody DeliveryPackagesModel article) throws ServerException {
		DeliveryPackagesInterface.save(article);
		if (article == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Integer> deleteDeliveryPackagesModel(@PathVariable("id")Integer id) {
		DeliveryPackagesInterface.deleteById(id);
		return new ResponseEntity<>(id, HttpStatus.OK);
	}
}
