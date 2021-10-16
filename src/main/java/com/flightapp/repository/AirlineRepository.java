package com.flightapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightapp.model.Airline;

@Repository
public interface AirlineRepository extends JpaRepository<Airline, Long> {
	
}
