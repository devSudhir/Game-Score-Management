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

import com.game.score.management.entity.Player;
import com.game.score.management.service.PlayerService;

@RestController
@RequestMapping("/api/player")
public class PlayerController {

	@Autowired
	private PlayerService playerService;

	@GetMapping("/all")
	public List<Player> players() {
		return playerService.players();
	}

	@GetMapping("/{id}")
	public Player getPlayerById(@PathVariable Integer id) {
		return playerService.getPlayerById(id);
	}

	@PostMapping("/")
	public void saveOrUpdate(@RequestBody List<Player> players) {
		playerService.saveOrUpdate(players);
	}

	@DeleteMapping("/{id}")
	public void deletePlayerById(@PathVariable Integer id) {
		playerService.deletePlayerById(id);
	}
}
