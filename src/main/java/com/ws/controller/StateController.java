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

import com.ws.models.StateModel;
import com.ws.repositories.StateInterface;

@RestController
@RequestMapping("/state")
public class StateController {
	@Autowired
	private StateInterface StateInterface;
	
	@GetMapping
	public List<StateModel> StateModel(){
		return (List<StateModel>) StateInterface.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Optional<StateModel> getByStateModel(@PathVariable("id")Integer id) {
		return (Optional<StateModel>) StateInterface.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<com.ws.models.StateModel> insertStateModel(@RequestBody StateModel article) throws ServerException {
		StateInterface.save(article);
		if (article == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }
	}
	
	@PutMapping
	public ResponseEntity<com.ws.models.StateModel> updateStateModel(@RequestBody StateModel article) throws ServerException {
		StateInterface.save(article);
		if (article == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Integer> deleteStateModel(@PathVariable("id")Integer id) {
		StateInterface.deleteById(id);
		return new ResponseEntity<>(id, HttpStatus.OK);
	}
}
