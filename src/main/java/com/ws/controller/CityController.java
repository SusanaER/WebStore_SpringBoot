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

import com.ws.models.CityModel;
import com.ws.repositories.CityInterface;

@RestController
@RequestMapping("/city")
public class CityController {
	@Autowired
	private CityInterface CityInterface;
	
	@GetMapping
	public List<CityModel> CityModel(){
		return (List<CityModel>) CityInterface.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Optional<CityModel> getByCityModel(@PathVariable("id")Integer id) {
		return (Optional<CityModel>) CityInterface.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<CityModel> insertCityModel(@RequestBody CityModel city) throws ServerException {
		CityInterface.save(city);
		if (city == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(city, HttpStatus.CREATED);
	    }
	}
	
	@PutMapping
	public ResponseEntity<CityModel> updateCityModel(@RequestBody CityModel city) throws ServerException {
		CityInterface.save(city);
		if (city == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(city, HttpStatus.CREATED);
	    }
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Integer> deleteCityModel(@PathVariable("id")Integer id) {
		CityInterface.deleteById(id);
		return new ResponseEntity<>(id, HttpStatus.OK);
	}
}
