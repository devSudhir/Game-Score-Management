package com.game.score.management.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.game.score.management.entity.Score;

@Repository
public interface ScoreRepository extends CrudRepository<Score, Integer>{

	List<Score> findByPlayerIdAndGameId(Integer playerId, Integer gameId);

	List<Score> findByGameId(Integer gameId);

}
