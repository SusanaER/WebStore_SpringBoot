package com.ws.controller;

import java.rmi.ServerException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ws.models.ArticleModel;
import com.ws.repositories.ArticleInterface;

@RestController
@RequestMapping("/article")
public class ArticleController {
	
	@Autowired
	private ArticleInterface articleInterface;
	
	@GetMapping
	public List<ArticleModel> ArticleModel(){
		return (List<ArticleModel>) articleInterface.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Optional<ArticleModel> getByArticleModel(@PathVariable("id")Integer id) {
		return (Optional<ArticleModel>) articleInterface.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<ArticleModel> insertArticleModel(@RequestBody ArticleModel article) throws ServerException {
		articleInterface.save(article);
		if (article == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }
	}
	
	@PutMapping
	public ResponseEntity<ArticleModel> updateArticleModel(@RequestBody ArticleModel article) throws ServerException{
		articleInterface.save(article);
		if (article == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Integer> deleteArticleModel(@PathVariable("id")Integer id){
		articleInterface.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
	}
}
