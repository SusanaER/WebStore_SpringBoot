package com.ws.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ws.models.ArticlePurchaseModel;

@Repository
public interface ArticlePurchaseInterface extends CrudRepository<ArticlePurchaseModel, Integer>{

}
