package com.hackerrank.stocktrade.repository;

import java.util.List;

import com.hackerrank.stocktrade.model.Actor;
public interface CustomActorRepository {
	List<Actor> getActorsOrderedByTotalNumberOfEvents();
}
