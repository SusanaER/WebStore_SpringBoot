package com.ws.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ws.models.StateModel;

@Repository
public interface StateInterface extends CrudRepository<StateModel, Integer>{

}
