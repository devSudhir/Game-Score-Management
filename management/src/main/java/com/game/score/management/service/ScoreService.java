package com.game.score.management.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.score.management.entity.Score;
import com.game.score.management.repository.ScoreRepository;

@Service
public class ScoreService {
	
	@Autowired
	private ScoreRepository scoreRepository;

	public List<Score> Scores() {
		List<Score> allScores = new ArrayList<>();
		scoreRepository.findAll().forEach(Score -> allScores.add(Score));
		return allScores;
	}

	public Score getScoreById(Integer id) {
		return scoreRepository.findById(id).get();
	}

	public boolean saveOrUpdate(List<Score> Scores) {
		scoreRepository.saveAll(Scores);
		return true;
	}

	public boolean deleteScoreById(Integer id) {
		scoreRepository.deleteById(id);
		return true;
	}
	
	public Score getMaxScoreForAPlayer(Integer playerId, Integer gameId) {
		List<Score> allScoreGetByUser = scoreRepository.findByPlayerIdAndGameId(playerId, gameId);
		Score maxScoreGetByPlayer = allScoreGetByUser
                .stream()
                .max(Comparator.comparing(Score::getScore))
                .orElseThrow(NoSuchElementException::new);
		return maxScoreGetByPlayer;
	}
	
	public Score getMaxScoreAssociatedWithAGame(Integer gameId) {
		List<Score> allScoreGetByAllUser = scoreRepository.findByGameId(gameId);
		Score maxScoreAssociatedWithAGame = allScoreGetByAllUser
                .stream()
                .max(Comparator.comparing(Score::getScore))
                .orElseThrow(NoSuchElementException::new);
		return maxScoreAssociatedWithAGame;
	}
}
