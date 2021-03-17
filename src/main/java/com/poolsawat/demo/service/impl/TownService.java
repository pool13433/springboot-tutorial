package com.poolsawat.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poolsawat.demo.entity.Town;
import com.poolsawat.demo.repository.TownRepository;
import com.poolsawat.demo.service.ITownService;

@Service
public class TownService implements ITownService{
	
	@Autowired
	private TownRepository repository;

	@Override
	public List<Town> findAll() {
		return (List<Town>)repository.findAll();
	}

	@Override
	public Town save(Town entity) {
		return repository.save(entity);
	}

	@Override
	public boolean delete(Long id) {
		repository.deleteById(id);
		return true;
	}
	
	
	
}
