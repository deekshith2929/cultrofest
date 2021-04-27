package com.cg.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.sql.Time;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name = "Event")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long eventId;

	private String name;

	private LocalDate eventDate;

	private float amount;

	private LocalDate finalRegDate;

	private Time startTime;

	private Time endTime;

	private String venue;
	
	private long  limits;

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Event(long eventId, String name, LocalDate eventDate, float amount, LocalDate finalRegDate,
			Time startTime, Time endTime, String venue, long limits) {
		super();
		this.eventId = eventId;
		this.name = name;
		this.eventDate = eventDate;
		this.amount = amount;
		this.finalRegDate = finalRegDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.venue = venue;
		this.limits = limits;
	}

	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public String getName() {
		return name;
	}

	public void setName(String Name) {
		this.name = Name;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public LocalDate getFinalRegDate() {
		return finalRegDate;
	}

	public void setFinalRegDate(LocalDate finalRegDate) {
		this.finalRegDate = finalRegDate;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}


	  public long getLimits() {
		  return limits; 
	}
	  
	  public void setLimits(long limits) {
		  this.limits = limits;
	 }
	 
	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", name=" + name + ", eventDate=" + eventDate + ", amount="
				+ amount + ", finalRegDate=" + finalRegDate + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", venue=" + venue + ",limits=" + limits + "]";
	}

}
