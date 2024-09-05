package com.microservice.celulares.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservice.celulares.entity.Celular;

/**
 * CelularDao
 */
public interface CelularDao extends CrudRepository<Celular, Long> {


}
