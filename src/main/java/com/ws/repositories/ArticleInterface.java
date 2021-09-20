package com.ws.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ws.models.ArticleModel;

@Repository
public interface ArticleInterface extends CrudRepository<ArticleModel, Integer>{

}
