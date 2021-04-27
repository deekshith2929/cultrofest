package com.cg.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;


import com.cg.model.*;
import com.cg.repository.*;
import com.cg.service.*;

import ch.qos.logback.classic.Logger;
import lombok.extern.slf4j.Slf4j;

import com.cg.exception.*;
@CrossOrigin(origins="http://localhost:3000")
@RestController
//@RequestMapping("/api")
@Slf4j
public class EventController {
	 
	@Autowired
	  private EventService evtService;

	@Autowired
	private EventRepository evtRepo;
    
	final Logger log=(Logger) org.slf4j.LoggerFactory.getLogger(EventController.class);
	//To create Event	
 	 @PostMapping("/event")
	  public Event createEvent(@RequestBody Event e)
		{	
		log.info("saves Event  details"+e.toString());
			return evtService.createEvent(e);
		}
 	 
 	 //Delete Event Based on Id
	 @DeleteMapping("/event/{id}")
	  public String deleteEvent(@PathVariable(value="id" )long evtid) throws EventNotFoundException
		{
		 	
		 	Event e=evtRepo.findById(evtid).orElseThrow(()->new EventNotFoundException("sorry!!! No Event found with that id"));
		 	evtService.deleteEvent(e);
		 	log.info("Delete the user");
		 	return "Event deleted";
		}
		
	 
	 //Get All Events 
		 @GetMapping("/event")
		 public List<Event> getAllEvents(){ 
			  log.info("Display all events list");
			 return evtRepo.findAll();
			 }
		 	
     //Get Events Based on Id
		  @GetMapping("/events/{id}")
		  public ResponseEntity<Event> getEventById(@PathVariable(value="id") long evtid) throws EventNotFoundException 
		  {
			  
			  Event event=evtService.getEventById(evtid).orElseThrow(()->new EventNotFoundException("sorry!! no event found")); 
			  return ResponseEntity.ok().body(event);
	      }
    //Get Events Based on Names
		  @GetMapping("/event/{name}")
		    public List<Event> getEventByName(@PathVariable(value="name") String name)
		    { 
				log.info("Dispaly the user details by name");

				return  evtService.getEventByName(name);
		    }
}
