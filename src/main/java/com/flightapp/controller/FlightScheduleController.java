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
import com.flightapp.model.FlightSchedule;
import com.flightapp.payload.request.FlightScheduleRequest;
import com.flightapp.service.FlightScheduleService;


@RestController
@RequestMapping("/api/airline/schedule")
public class FlightScheduleController {
	
	@Autowired
	FlightScheduleService flightScheduleService;
	
	@GetMapping("/getAll")
	public List<FlightSchedule> getAllFlightSchedules() {
		return flightScheduleService.getAllFlightSchedules();		
	}
	
	@PostMapping("/add")
	public FlightSchedule addFlightSchedule(@RequestBody FlightScheduleRequest flightScheduleRequest) {
		return flightScheduleService.addFlightSchedule(flightScheduleRequest);		
	}
	
	@PutMapping("/update")
	public FlightSchedule updateFlightSchedule(@RequestBody FlightScheduleRequest flightScheduleRequest) {
		return flightScheduleService.updateFlightSchedule(flightScheduleRequest);
	}
	
	@DeleteMapping("/delete")
	public void deleteFlightSchedule(@RequestBody FlightScheduleRequest flightScheduleRequest) {
		flightScheduleService.deleteFlightSchedule(flightScheduleRequest);
	}
}
