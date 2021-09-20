package com.ws.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ws.models.ClientCreditCardModel;

@Repository
public interface ClientCreditCardInterface extends CrudRepository<ClientCreditCardModel, Integer>{

}
