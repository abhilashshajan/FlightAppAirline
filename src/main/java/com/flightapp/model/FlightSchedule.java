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
	private int seatCount;
		
	@NotNull
	private String ticketPrice;
	
	@NotNull
	private Date updatedTime;
		
	@NotBlank
	@Size(max = 20)
	private String updatedBy;
		
    @ManyToOne()
    private Airline airline;

	public FlightSchedule() {
	}

	public FlightSchedule(Long id, @NotBlank @Size(max = 4) String flightNumber,
			@NotBlank @Size(max = 3) String departureAirport, @NotBlank @Size(max = 3) String arrivalAirport,
			@NotNull Date departureTime, @NotNull Date arrivalTime, @NotBlank @Size(max = 7) String frequency,
			@NotBlank @Size(max = 10) String aircraftRegistration, @NotNull int seatCount, @NotNull String ticketPrice,
			@NotNull Date updatedTime, @NotBlank @Size(max = 20) String updatedBy, Airline airline) {
		super();
		this.id = id;
		this.flightNumber = flightNumber;
		this.departureAirport = departureAirport;
		this.arrivalAirport = arrivalAirport;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.frequency = frequency;
		this.aircraftRegistration = aircraftRegistration;
		this.seatCount = seatCount;
		this.ticketPrice = ticketPrice;
		this.updatedTime = updatedTime;
		this.updatedBy = updatedBy;
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

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	public String getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	
}
