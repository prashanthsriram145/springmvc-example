package com.springboot.mvcexample.data;

import com.springboot.mvcexample.model.Aircraft;
import org.springframework.data.repository.CrudRepository;

public interface AircraftRepository extends CrudRepository<Aircraft, Long> {}
