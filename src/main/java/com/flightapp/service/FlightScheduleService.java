package com.flightapp.service;

import java.util.List;

import com.flightapp.model.FlightSchedule;
import com.flightapp.payload.request.FlightScheduleRequest;

public interface FlightScheduleService {
	
	public List<FlightSchedule> getAllFlightSchedules();
	
	public FlightSchedule addFlightSchedule(FlightScheduleRequest flightScheduleRequest);
	
	public FlightSchedule updateFlightSchedule(FlightScheduleRequest flightScheduleRequest);
	
	public void deleteFlightSchedule(FlightScheduleRequest flightScheduleRequest);
}
