package com.ws.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ws.models.ClientDelAddModel;

@Repository
public interface ClientDelAddInterface extends CrudRepository<ClientDelAddModel, Integer>{

}
