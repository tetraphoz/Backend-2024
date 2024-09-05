
package com.microservice.store.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.microservice.store.client.CelularClienteFeign;
import com.microservice.store.models.Store;

@Service("serviceFeign")
@Primary
public class StoreServiceFeignImpl implements StoreService{

    @Autowired
    private CelularClienteFeign clientFeign;



	@Override
	public List<Store> findAll() {
        return clientFeign.list().stream().map(c -> new Store(c, 5)).collect(Collectors.toList());
	}

	@Override
	public Store findById(Long id, Integer cantidad) {
        return new Store (clientFeign.detail(id), cantidad);
	}


}
