package com.poolsawat.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poolsawat.demo.entity.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {
	List<City> findByPopulationGreaterThan(int value);
	List<City> findByPopulationLessThan(int value);
}
