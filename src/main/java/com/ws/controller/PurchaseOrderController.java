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

import com.ws.models.PurchaseOrderModel;
import com.ws.repositories.PurchaseOrderInterface;

@RestController
@RequestMapping("/purchaseOrder")
public class PurchaseOrderController {
	@Autowired
	private PurchaseOrderInterface PurchaseOrderInterface;
	
	@GetMapping
	public List<PurchaseOrderModel> PurchaseOrderModel(){
		return (List<PurchaseOrderModel>) PurchaseOrderInterface.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Optional<PurchaseOrderModel> getByPurchaseOrderModel(@PathVariable("id")Integer id) {
		return (Optional<PurchaseOrderModel>) PurchaseOrderInterface.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<com.ws.models.PurchaseOrderModel> insertPurchaseOrderModel(@RequestBody PurchaseOrderModel article) throws ServerException {
		PurchaseOrderInterface.save(article);
		if (article == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }
	}
	
	@PutMapping
	public ResponseEntity<com.ws.models.PurchaseOrderModel> updatePurchaseOrderModel(@RequestBody PurchaseOrderModel article) throws ServerException {
		PurchaseOrderInterface.save(article);
		if (article == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Integer> deletePurchaseOrderModel(@PathVariable("id")Integer id) {
		PurchaseOrderInterface.deleteById(id);
		return new ResponseEntity<>(id, HttpStatus.OK);
	}
}
