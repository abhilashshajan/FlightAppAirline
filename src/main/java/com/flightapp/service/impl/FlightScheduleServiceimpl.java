package com.flightapp.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.model.FlightSchedule;
import com.flightapp.payload.request.FlightScheduleRequest;
import com.flightapp.repository.FlightScheduleRepository;
import com.flightapp.service.AirlineService;
import com.flightapp.service.FlightScheduleService;

@Service
public class FlightScheduleServiceimpl implements FlightScheduleService {

	@Autowired
	FlightScheduleRepository flightScheduleRepository;
	
	@Autowired
	AirlineService airlineService;
	
	@Override
	public List<FlightSchedule> getAllFlightSchedules() {
		// TODO Auto-generated method stub
		return flightScheduleRepository.findAll();	
	}

	@Override
	public FlightSchedule addFlightSchedule(FlightScheduleRequest flightScheduleRequest) {
		// TODO Auto-generated method stub
		System.out.println(flightScheduleRequest.toString());
		FlightSchedule schedule = new FlightSchedule();
    	schedule.setFlightNumber(flightScheduleRequest.getFlightNumber());
    	schedule.setDepartureAirport(flightScheduleRequest.getDepartureAirport());
    	schedule.setArrivalAirport(flightScheduleRequest.getArrivalAirport());
    	schedule.setDepartureTime(convertStringTimetoDate(flightScheduleRequest.getDepartureTime()));
    	schedule.setArrivalTime(convertStringTimetoDate(flightScheduleRequest.getArrivalTime()));
    	schedule.setFrequency(flightScheduleRequest.getFrequency());
    	schedule.setAircraftRegistration(flightScheduleRequest.getAircraftRegistration());
    	schedule.setSeatCount(flightScheduleRequest.getSeatCount());
    	schedule.setTicketPrice(flightScheduleRequest.getTicketPrice());
    	schedule.setUpdatedTime(new Date());
    	schedule.setUpdatedBy(flightScheduleRequest.getUpdatedBy());
    	schedule.setAirline(airlineService.getAirlineById(flightScheduleRequest.getAirlineId()));
		return flightScheduleRepository.save(schedule);
	}

	@Override
	public FlightSchedule updateFlightSchedule(FlightScheduleRequest flightScheduleRequest) {
		// TODO Auto-generated method stub
		FlightSchedule flightScheduleResp = new FlightSchedule();
		Optional<FlightSchedule> optionalFlightSchedule = flightScheduleRepository.findById(flightScheduleRequest.getId()).map(record -> {
        	record.setFlightNumber(flightScheduleRequest.getFlightNumber());
        	record.setDepartureAirport(flightScheduleRequest.getDepartureAirport());
        	record.setArrivalAirport(flightScheduleRequest.getArrivalAirport());
        	record.setDepartureTime(convertStringTimetoDate(flightScheduleRequest.getDepartureTime()));
        	record.setArrivalTime(convertStringTimetoDate(flightScheduleRequest.getArrivalTime()));
        	record.setFrequency(flightScheduleRequest.getFrequency());
        	record.setAircraftRegistration(flightScheduleRequest.getAircraftRegistration());
        	record.setSeatCount(flightScheduleRequest.getSeatCount());
        	record.setTicketPrice(flightScheduleRequest.getTicketPrice());
        	record.setUpdatedTime(new Date());
        	record.setUpdatedBy(flightScheduleRequest.getUpdatedBy());
        	record.setAirline(airlineService.getAirlineById(flightScheduleRequest.getAirlineId()));
        	return flightScheduleRepository.save(record);
        });
		if (optionalFlightSchedule.isPresent()) {
			flightScheduleResp = optionalFlightSchedule.get();
		}
		return flightScheduleResp;
	}

	@Override
	public void deleteFlightSchedule(FlightScheduleRequest flightScheduleRequest) {
		// TODO Auto-generated method stub
		flightScheduleRepository.deleteById(flightScheduleRequest.getId());
	}
	
	public Date convertStringTimetoDate(String time) {
		DateFormat sdf = new SimpleDateFormat("hh:mm");
		Date date = null;
		try {
			date = sdf.parse(time);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

}
