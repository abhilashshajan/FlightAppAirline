package com.flightapp.payload.request;

public class FlightScheduleRequest {


	private Long id;

	private long airlineId;
	
	private String flightNumber;
	
	private String departureAirport;

	private String arrivalAirport;
	
	private String departureTime;

	private String arrivalTime;

	private String frequency;
	
	private String aircraftRegistration;
	
	private int seatCount;
		
	private String ticketPrice;
	
	private String updatedTime;
		
	private String updatedBy;

	public FlightScheduleRequest(Long id, long airlineId, String flightNumber, String departureAirport,
			String arrivalAirport, String departureTime, String arrivalTime, String frequency,
			String aircraftRegistration, int seatCount, String ticketPrice, String updatedTime, String updatedBy) {
		super();
		this.id = id;
		this.airlineId = airlineId;
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
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(long airlineId) {
		this.airlineId = airlineId;
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

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
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

	public String getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Override
	public String toString() {
		return "FlightScheduleRequest [id=" + id + ", airlineId=" + airlineId + ", flightNumber=" + flightNumber
				+ ", departureAirport=" + departureAirport + ", arrivalAirport=" + arrivalAirport + ", departureTime="
				+ departureTime + ", arrivalTime=" + arrivalTime + ", frequency=" + frequency
				+ ", aircraftRegistration=" + aircraftRegistration + ", seatCount=" + seatCount + ", ticketCost="
				+ ticketPrice + ", updatedTime=" + updatedTime + ", updatedBy=" + updatedBy + "]";
	}
	
	

}
