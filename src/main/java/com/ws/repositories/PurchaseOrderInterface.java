package com.ws.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ws.models.PurchaseOrderModel;

@Repository
public interface PurchaseOrderInterface extends CrudRepository<PurchaseOrderModel, Integer>{

}
