package com.ws.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ws.models.CityModel;

@Repository
public interface CityInterface extends CrudRepository<CityModel, Integer>{

}
