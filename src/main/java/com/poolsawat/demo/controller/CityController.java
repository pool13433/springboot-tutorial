package com.poolsawat.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poolsawat.demo.entity.City;
import com.poolsawat.demo.service.ICityService;

@RestController
@RequestMapping("/city")
public class CityController {
	
	@Autowired
	private ICityService service;
		
	@GetMapping(value = "/list")
	public List<City> getCities(){
		return service.findAll();
	}
	
	@PostMapping(value = "/save")
	public City saveCity(@RequestBody City city){
		return service.save(city);
	}
	
	@GetMapping(value = "/population/greater/{value}")
	public List<City> getCitiesByGreaterPopulation(@PathVariable int value){
		return service.findByPopulationGreaterThan(value);
	}
	
	@GetMapping(value = "/population/less/{value}")
	public List<City> getCitiesByLessPopulation(@PathVariable int value){
		return service.findByPopulationLessThan(value);
	}
}
