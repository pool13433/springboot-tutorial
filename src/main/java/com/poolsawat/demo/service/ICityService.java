package com.poolsawat.demo.service;

import java.util.List;
import java.util.Optional;

import com.poolsawat.demo.entity.City;


public interface ICityService {
	List<City> findAll();
	List<City> findByPopulationGreaterThan(int value);
	List<City> findByPopulationLessThan(int value);
	City save(City entity);
}
