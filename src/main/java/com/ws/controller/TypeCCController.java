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

import com.ws.models.TypeCCModel;
import com.ws.repositories.TypeCCInterface;

@RestController
@RequestMapping("/typeCC")
public class TypeCCController {
	@Autowired
	private TypeCCInterface TypeCCInterface;
	
	@GetMapping
	public List<TypeCCModel> TypeCCModel(){
		return (List<TypeCCModel>) TypeCCInterface.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Optional<TypeCCModel> getByTypeCCModel(@PathVariable("id")Integer id) {
		return (Optional<TypeCCModel>) TypeCCInterface.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<com.ws.models.TypeCCModel> insertTypeCCModel(@RequestBody TypeCCModel article) throws ServerException {
		TypeCCInterface.save(article);
		if (article == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }
	}
	
	@PutMapping
	public ResponseEntity<com.ws.models.TypeCCModel> updateTypeCCModel(@RequestBody TypeCCModel article) throws ServerException {
		TypeCCInterface.save(article);
		if (article == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Integer> deleteTypeCCModel(@PathVariable("id")Integer id) {
		TypeCCInterface.deleteById(id);
		return new ResponseEntity<>(id, HttpStatus.OK);
	}
}
