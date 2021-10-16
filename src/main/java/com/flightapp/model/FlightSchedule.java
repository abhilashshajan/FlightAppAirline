package com.flightapp.model;

import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(	name = "flightschedules" )
public class FlightSchedule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(max = 4)
	private String flightNumber;

	@NotBlank
	@Size(max = 3)
	private String departureAirport;

	@NotBlank
	@Size(max = 3)
	private String arrivalAirport;
	
	@NotNull
	private Date departureTime;

	@NotNull
	private Date arrivalTime;
	
	@NotBlank
	@Size(max = 7)
	private String frequency;
	
	@NotBlank
	@Size(max = 10)
	private String aircraftRegistration;
	
	@NotNull
	private int businessSeatCount;
	
	@NotNull
	private int nonBusinessSeatCount;
	
	@NotNull
	private String businessTicketCost;
	
	@NotNull
	private String nonBusinessTicketCost;
	
    @ManyToOne()
    private Airline airline;

	public FlightSchedule() {
	}

	public FlightSchedule(Long id, @NotBlank @Size(max = 4) String flightNumber,
			@NotBlank @Size(max = 3) String departureAirport, @NotBlank @Size(max = 3) String arrivalAirport,
			@NotNull Date departureTime, @NotNull Date arrivalTime, @NotBlank @Size(max = 7) String frequency,
			@NotBlank @Size(max = 10) String aircraftRegistration, @NotNull int businessSeatCount,
			@NotNull int nonBusinessSeatCount, @NotNull String businessTicketCost,
			@NotNull String nonBusinessTicketCost, Airline airline) {
		super();
		this.id = id;
		this.flightNumber = flightNumber;
		this.departureAirport = departureAirport;
		this.arrivalAirport = arrivalAirport;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.frequency = frequency;
		this.aircraftRegistration = aircraftRegistration;
		this.businessSeatCount = businessSeatCount;
		this.nonBusinessSeatCount = nonBusinessSeatCount;
		this.businessTicketCost = businessTicketCost;
		this.nonBusinessTicketCost = nonBusinessTicketCost;
		this.airline = airline;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getDepartureAirport() {
		return departureAirport;
	}

	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}

	public String getArrivalAirport() {
		return arrivalAirport;
	}

	public void setArrivalAirport(String arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getAircraftRegistration() {
		return aircraftRegistration;
	}

	public void setAircraftRegistration(String aircraftRegistration) {
		this.aircraftRegistration = aircraftRegistration;
	}

	public int getBusinessSeatCount() {
		return businessSeatCount;
	}

	public void setBusinessSeatCount(int businessSeatCount) {
		this.businessSeatCount = businessSeatCount;
	}

	public int getNonBusinessSeatCount() {
		return nonBusinessSeatCount;
	}

	public void setNonBusinessSeatCount(int nonBusinessSeatCount) {
		this.nonBusinessSeatCount = nonBusinessSeatCount;
	}

	public String getBusinessTicketCost() {
		return businessTicketCost;
	}

	public void setBusinessTicketCost(String businessTicketCost) {
		this.businessTicketCost = businessTicketCost;
	}

	public String getNonBusinessTicketCost() {
		return nonBusinessTicketCost;
	}

	public void setNonBusinessTicketCost(String nonBusinessTicketCost) {
		this.nonBusinessTicketCost = nonBusinessTicketCost;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	
	
}
