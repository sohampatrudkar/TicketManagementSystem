package com.ticketmanagementsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

public class TicketManagementSystem {

@Entity
@Table(name = "ticketTable", schema="TM")
public class Tickets {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@NonNull
		private int id;
		
		@NonNull
		@Column
		private String details;
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public String getDetails() {
			return details;
		}
		
		public void setDetails(String details) {
			this.details = details;
		}	
		
		}
}
