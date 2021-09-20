package com.ws.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ws.models.DeliveryAddressModel;

@Repository
public interface DeliveryAddressInterface extends CrudRepository<DeliveryAddressModel, Integer>{

}
