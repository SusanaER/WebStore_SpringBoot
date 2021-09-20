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

import com.ws.models.ArticlePurchaseModel;
import com.ws.models.PurchaseOrderModel;
import com.ws.repositories.ArticlePurchaseInterface;
import com.ws.repositories.PurchaseOrderInterface;

@RestController
@RequestMapping("/articlePurchase")
public class ArticlePruchaseController {
	@Autowired
	private ArticlePurchaseInterface articlePurchaseInterface;
	private PurchaseOrderInterface poInterface;
	
	@GetMapping
	public Iterable<ArticlePurchaseModel> articles(){
		
		return (List<ArticlePurchaseModel>) articlePurchaseInterface.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Optional<ArticlePurchaseModel> getByArticles(@PathVariable("id")Integer id) {
		return  articlePurchaseInterface.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<ArticlePurchaseModel> insertArticles(@RequestBody ArticlePurchaseModel article, PurchaseOrderModel po) throws ServerException {
		articlePurchaseInterface.save(article);
		poInterface.save(po);
		if (po == null || article == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }
	}
	
	@PutMapping
	public ResponseEntity<ArticlePurchaseModel> updateArticles(@RequestBody ArticlePurchaseModel article) throws ServerException{
		articlePurchaseInterface.save(article);
		if (article == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Integer> deleteArticles(@PathVariable("id")Integer id) {
		articlePurchaseInterface.deleteById(id);
		return new ResponseEntity<>(id, HttpStatus.OK);
	}
}
