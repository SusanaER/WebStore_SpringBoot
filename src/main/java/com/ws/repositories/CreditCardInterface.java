package com.ws.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ws.models.CreditCardModel;

@Repository
public interface CreditCardInterface extends CrudRepository<CreditCardModel, Integer>{

}
