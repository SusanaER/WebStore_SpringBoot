package com.ws.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ws.models.DeliveryCompanyModel;

@Repository
public interface DeliveryCompanyInterface extends CrudRepository<DeliveryCompanyModel, Integer>{

}
