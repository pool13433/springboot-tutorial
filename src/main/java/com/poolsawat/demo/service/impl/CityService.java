package com.poolsawat.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poolsawat.demo.entity.City;
import com.poolsawat.demo.repository.CityRepository;
import com.poolsawat.demo.service.ICityService;

@Service
public class CityService implements ICityService{
	
	@Autowired
	private CityRepository repository;

	@Override
	public List<City> findAll() {
		return (List<City>)repository.findAll();
	}

	@Override
	public List<City> findByPopulationGreaterThan(int value) {
		return repository.findByPopulationGreaterThan(value);
	}

	@Override
	public List<City> findByPopulationLessThan(int value) {
		return repository.findByPopulationLessThan(value);
	}

	@Override
	public City save(City entity) {
		return repository.save(entity);
	}
	

}
