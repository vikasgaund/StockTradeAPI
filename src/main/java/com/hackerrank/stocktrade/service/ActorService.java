package com.hackerrank.stocktrade.service;

import java.util.List;
import java.util.Optional;
import com.hackerrank.stocktrade.model.Actor;

public interface ActorService {
	List<Actor> getActorsOrderedByMaximumStreak();

	Optional<Actor> update(Actor actor);

	List<Actor> getActorsOrderedByTotalNumberOfEvents();
}
