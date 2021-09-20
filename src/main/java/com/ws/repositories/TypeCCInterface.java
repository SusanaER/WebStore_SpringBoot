package com.ws.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ws.models.TypeCCModel;

@Repository
public interface TypeCCInterface extends CrudRepository<TypeCCModel, Integer>{

}
