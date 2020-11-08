package com.hackerrank.stocktrade.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackerrank.stocktrade.exception.BadRequestException;
import com.hackerrank.stocktrade.exception.NotFoundException;
import com.hackerrank.stocktrade.model.Actor;
import com.hackerrank.stocktrade.repository.ActorRepository;
import com.hackerrank.stocktrade.service.ActorService;

@Service
public class ActorServiceImpl implements ActorService{

	@Autowired
	private ActorRepository actorRepository;

	@Override
	public List<Actor> getActorsOrderedByMaximumStreak() {
		return actorRepository.getActorsOrderedByMaximumStreak();
	}

	@Override
	public Optional<Actor> update(Actor actor) {
		Optional<Actor> persistedActor = actorRepository.findById(actor.getId());
		if (persistedActor.isPresent()) {
			if (Objects.equals(actor.getLogin(), persistedActor.get().getLogin())) {
				return Optional.ofNullable(actorRepository.save(actor));
			} else {
				throw new BadRequestException();
			}
		} else {
			throw new NotFoundException();
		}
	}

	@Override
	public List<Actor> getActorsOrderedByTotalNumberOfEvents() {
		return actorRepository.getActorsOrderedByTotalNumberOfEvents();
	}
}
