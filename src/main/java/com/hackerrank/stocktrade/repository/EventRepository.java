package com.hackerrank.stocktrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackerrank.stocktrade.model.Event;

public interface EventRepository extends JpaRepository<Event, Long>{

}
