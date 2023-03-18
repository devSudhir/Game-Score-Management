package com.game.score.management.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.game.score.management.entity.Game;

@Repository
public interface GameRepository extends CrudRepository<Game, Integer>{

}
