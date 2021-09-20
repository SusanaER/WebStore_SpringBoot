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

import com.ws.models.DeliveryCompanyModel;
import com.ws.repositories.DeliveryCompanyInterface;

@RestController
@RequestMapping("/deliveryCompany")
public class DeliveryCompanyController {
	@Autowired
	private DeliveryCompanyInterface DeliveryCompanyInterface;
	
	@GetMapping
	public List<DeliveryCompanyModel> DeliveryCompanyModel(){
		return (List<DeliveryCompanyModel>) DeliveryCompanyInterface.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Optional<DeliveryCompanyModel> getByDeliveryCompanyModel(@PathVariable("id")Integer id) {
		return (Optional<DeliveryCompanyModel>) DeliveryCompanyInterface.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<DeliveryCompanyModel> insertDeliveryCompanyModel(@RequestBody DeliveryCompanyModel article) throws ServerException {
		DeliveryCompanyInterface.save(article);
		if (article == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }
	}
	
	@PutMapping
	public ResponseEntity<DeliveryCompanyModel> updateDeliveryCompanyModel(@RequestBody DeliveryCompanyModel article) throws ServerException {
		DeliveryCompanyInterface.save(article);
		if (article == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Integer> deleteDeliveryCompanyModel(@PathVariable("id")Integer id) {
		DeliveryCompanyInterface.deleteById(id);
		return new ResponseEntity<>(id, HttpStatus.OK);
	}
}
