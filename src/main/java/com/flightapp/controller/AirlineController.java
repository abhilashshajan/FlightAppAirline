package com.flightapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.flightapp.model.Airline;
import com.flightapp.service.AirlineService;


@RestController
@RequestMapping("/api/airline")
public class AirlineController {
	
	@Autowired
	AirlineService airlineService;
	
	@GetMapping("/getAll")
	public List<Airline> getAllAirlines() {
		return airlineService.getAllAirlines();		
	}
	
	@PostMapping("/add")
	public Airline addAirline(@RequestBody Airline airline) {
		return airlineService.addAirline(airline);		
	}
	
	@PutMapping("/update")
	public Airline updateAirline(@RequestBody Airline airline) {
		return airlineService.updateAirline(airline);
	}
	
	@DeleteMapping("/delete")
	public void deleteAirline(@RequestBody Airline airline) {
		airlineService.deleteAirline(airline);
	}
}
