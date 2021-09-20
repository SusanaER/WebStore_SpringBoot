package com.ws.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ws.models.ClientsModel;

@Repository
public interface ClientInterface extends CrudRepository<ClientsModel, Integer>{

}
