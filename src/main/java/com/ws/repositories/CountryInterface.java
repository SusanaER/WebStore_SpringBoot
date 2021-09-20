package com.ws.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ws.models.CountryModel;

@Repository
public interface CountryInterface extends CrudRepository<CountryModel, Integer>{

}
