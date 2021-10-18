package com.flightapp.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.flightapp.model.Airline;
import com.flightapp.repository.AirlineRepository;
import com.flightapp.service.AirlineService;
import org.springframework.stereotype.Service;

@Service
public class AirlineServiceImpl implements AirlineService {

	@Autowired
	AirlineRepository airlineRepository;

	@Override
	public Airline getAirlineById(long id) {
		// TODO Auto-generated method stub
		Airline airlineResp = new Airline();
		Optional<Airline> optionalAirline = airlineRepository.findById(id);
		if (optionalAirline.isPresent()) {
			airlineResp = optionalAirline.get();
		}
		return airlineResp;
	}
	
	@Override
	public List<Airline> getAllAirlines() {
		// TODO Auto-generated method stub
		return airlineRepository.findAll();	
	}

	@Override
	public Airline addAirline(Airline airline) {
		// TODO Auto-generated method stub
		airline.setUpdatedTime(new Date());
		return airlineRepository.save(airline);
	}

	@Override
	public Airline updateAirline(Airline airline) {
		// TODO Auto-generated method stub
		Airline airlineResp = new Airline();
		Optional<Airline> optionalAirline = airlineRepository.findById(airline.getId()).map(record -> {
        	record.setAirlineName(airline.getAirlineName());
        	record.setAirlineCode(airline.getAirlineCode());
        	record.setContactNumber(airline.getContactNumber());
        	record.setUpdatedBy(airline.getUpdatedBy());
        	record.setUpdatedTime(new Date());
        	return airlineRepository.save(record);
        });
		if (optionalAirline.isPresent()) {
			airlineResp = optionalAirline.get();
		}
		return airlineResp;
	}

	@Override
	public void deleteAirline(Airline airline) {
		// TODO Auto-generated method stub
		airlineRepository.deleteById(airline.getId());
	}


}
