package com.game.score.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.game.score.management.entity.Score;
import com.game.score.management.service.ScoreService;

@RestController
@RequestMapping("/api/score")
public class ScoreController {

	@Autowired
	private ScoreService scoreService;

	@GetMapping("/all")
	public List<Score> Scores() {
		return scoreService.Scores();
	}

	@GetMapping("/{id}")
	public Score getScoreById(@PathVariable Integer id) {
		return scoreService.getScoreById(id);
	}

	@PostMapping("/")
	public void saveOrUpdate(@RequestBody List<Score> scores) {
		scoreService.saveOrUpdate(scores);
	}

	@DeleteMapping("/{id}")
	public void deleteScoreById(@PathVariable Integer id) {
		scoreService.deleteScoreById(id);
	}
	
	@GetMapping("/{gameId}/{playerId}/max")
	public Score getMaxScoreForAPlayer(@PathVariable Integer gameId, @PathVariable Integer playerId) {
		return scoreService.getMaxScoreForAPlayer(playerId, gameId);
	}
	
	@GetMapping("/{gameId}/max")
	public Score getMaxScoreAssociatedWithAGame(@PathVariable Integer gameId) {
		return scoreService.getMaxScoreAssociatedWithAGame(gameId);
	}
}
