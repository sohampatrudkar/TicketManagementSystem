package com.ticketmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.model.Ticket;
import com.ticketmanagementsystem.model.TicketManagementSystem.Tickets;
import com.ticketmanagementsystem.repository.TicketManagementSysytemRepositry;

@RestController
public class TicketManagementsSystemController {

	@Autowired
	TicketManagementSysytemRepositry repository;
	
	@GetMapping("/")
	public List<Ticket> bing() {
		System.out.println("bing is Successful!");
		return (List<Tickets>) repository.findAll();
	}	
	
	@PostMapping("/booked")
	public String bookedTicket(@RequestBody List<Tickets> tickets){
		try {
			repository.saveAll(tickets);
			return "Ticket Booked confirmed";
		} catch (Exception e) {
			System.out.println("Error : " +e);
			return "Something went wrong :(";
		} 
	}
	
	}

