package com.scalable.serviceone.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.scalable.serviceone.model.ServiceOneUserDetails;
@Repository
public interface ServiceOneRspository extends  CrudRepository<ServiceOneUserDetails, Integer>  
{

}
