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

import com.ws.models.CountryModel;
import com.ws.repositories.CountryInterface;

@RestController
@RequestMapping("/country")
public class CountryController {
	@Autowired
	private CountryInterface CountryInterface;
	
	@GetMapping
	public List<CountryModel> CountryModel(){
		return (List<CountryModel>) CountryInterface.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Optional<CountryModel> getByCountryModel(@PathVariable("id")Integer id) {
		return (Optional<CountryModel>) CountryInterface.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<CountryModel> insertCountryModel(@RequestBody CountryModel article) throws ServerException {
		CountryInterface.save(article);
		if (article == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }
	}
	
	@PutMapping
	public ResponseEntity<CountryModel> updateCountryModel(@RequestBody CountryModel article) throws ServerException {
		CountryInterface.save(article);
		if (article == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Integer> deleteCountryModel(@PathVariable("id")Integer id) {
		CountryInterface.deleteById(id);
		return new ResponseEntity<>(id, HttpStatus.OK);
	}
}
