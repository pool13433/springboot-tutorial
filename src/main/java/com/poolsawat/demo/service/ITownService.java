package com.poolsawat.demo.service;

import java.util.List;

import com.poolsawat.demo.entity.City;
import com.poolsawat.demo.entity.Town;


public interface ITownService {
	List<Town> findAll();
//	List<City> findByPopulationGreaterThan(int value);
//	List<City> findByPopulationLessThan(int value);
	Town save(Town entity);
	boolean delete(Long id);
}
