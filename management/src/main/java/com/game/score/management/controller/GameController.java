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

import com.game.score.management.entity.Game;
import com.game.score.management.service.GameService;

@RestController
@RequestMapping("/api/game")
public class GameController {

	@Autowired
	private GameService gameService;

	@GetMapping("/all")
	public List<Game> games() {
		return gameService.games();
	}

	@GetMapping("/{id}")
	public Game getGameById(@PathVariable Integer id) {
		return gameService.getGameById(id);
	}

	@PostMapping("/")
	public void saveOrUpdate(@RequestBody List<Game> games) {
		gameService.saveOrUpdate(games);
	}

	@DeleteMapping("/{id}")
	public void deleteGameById(@PathVariable Integer id) {
		gameService.deleteGameById(id);
	}

}
