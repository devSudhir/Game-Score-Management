package com.game.score.management.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.score.management.entity.Player;
import com.game.score.management.repository.PlayerRepository;

@Service
public class PlayerService {
	@Autowired
	private PlayerRepository playerRepository;

	public List<Player> players() {
		List<Player> allPlayers = new ArrayList<>();
		playerRepository.findAll().forEach(player -> allPlayers.add(player));
		return allPlayers;
	}

	public Player getPlayerById(Integer id) {
		return playerRepository.findById(id).get();
	}

	public boolean saveOrUpdate(List<Player> players) {
		playerRepository.saveAll(players);
		return true;
	}

	public boolean deletePlayerById(Integer id) {
		playerRepository.deleteById(id);
		return true;
	}

}
