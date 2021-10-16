package com.flightapp.service;

import java.util.List;

import com.flightapp.model.Airline;

public interface AirlineService {
	
	public List<Airline> getAllAirlines();
	
	public Airline addAirline(Airline airline);
	
	public Airline updateAirline(Airline airline);
	
	public void deleteAirline(Airline airline);
}
