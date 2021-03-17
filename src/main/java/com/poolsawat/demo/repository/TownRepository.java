package com.poolsawat.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poolsawat.demo.entity.Town;

@Repository
public interface TownRepository extends CrudRepository<Town, Long> {
	/*
	 * List<Town> findByPopulationGreaterThan(int value); List<Town>
	 * findByPopulationLessThan(int value);
	 */
	Town save(Town entity);
}
