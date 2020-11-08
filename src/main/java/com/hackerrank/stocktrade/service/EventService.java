package com.hackerrank.stocktrade.service;

import java.util.List;
import java.util.Optional;

import com.hackerrank.stocktrade.model.Event;

public interface EventService {

	void deleteAll();
	
	Iterable<Event> findAll();
	
	List<Event> getEventsByActorId(Long actorId);
	
	Optional<Event> save(Event event);
}
