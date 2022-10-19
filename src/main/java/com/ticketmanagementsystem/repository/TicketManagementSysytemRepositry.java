package com.ticketmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ticketmanagementsystem.model.TicketManagementSystem.Tickets;

@Repository
public interface TicketManagementSysytemRepositry extends JpaRepository<Tickets, Integer> {

}
