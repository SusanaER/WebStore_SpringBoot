package com.ws.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ws.models.DeliveryPackagesModel;

@Repository
public interface DeliveryPackagesInterface extends CrudRepository<DeliveryPackagesModel, Integer>{

}
