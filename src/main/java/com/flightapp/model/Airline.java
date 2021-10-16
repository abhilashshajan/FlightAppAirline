package com.flightapp.model;

import java.util.Date;
import java.util.Set;
import java.util.HashSet;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(	name = "airlines", 
		uniqueConstraints = { 
			@UniqueConstraint(columnNames = "airlineCode")
		})
public class Airline {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(max = 50)
	private String airlineName;

	@NotBlank
	@Size(max = 2)
	private String airlineCode;

	@NotBlank
	@Size(max = 15)
	private String contactNumber;
	
	@NotNull
	private Date updatedTime;
		
	@NotBlank
	@Size(max = 20)
	private String updatedBy;
	
	 
    @OneToMany(mappedBy="airline", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<FlightSchedule> flightSchedule = new HashSet<FlightSchedule>();

	public Airline() {
	}

	public Airline(String airlineName, String airlineCode, String contactNumber, Date updatedTime, String updatedBy) {
		this.airlineName = airlineName;
		this.airlineCode = airlineCode;
		this.contactNumber = contactNumber;
		this.updatedTime = updatedTime;
		this.updatedBy = updatedBy;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getAirlineCode() {
		return airlineCode;
	}

	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
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
	
}
