package com.poolsawat.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poolsawat.demo.entity.Town;
import com.poolsawat.demo.service.ITownService;

@RestController
@RequestMapping("/town")
public class TownController {
	
	@Autowired
	private ITownService service;
		
	@GetMapping(value = "/list")
	public List<Town> getTowns(){
		return service.findAll();
	}
	
	@PostMapping(value = "/save")
	public Town saveTown(@RequestBody Town town){
		return service.save(town);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public boolean saveTown(@PathVariable Long id){
		return service.delete(id);
	}
}
