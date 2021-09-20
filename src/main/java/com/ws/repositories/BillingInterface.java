package com.ws.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ws.models.BillingModel;

@Repository
public interface BillingInterface extends CrudRepository<BillingModel, Integer>{

}
