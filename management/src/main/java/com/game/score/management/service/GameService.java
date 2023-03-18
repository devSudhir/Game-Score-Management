package com.game.score.management.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.game.score.management.entity.Game;
import com.game.score.management.repository.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<Game> games() {
		List<Game> allGames = new ArrayList<>();
		gameRepository.findAll().forEach(game -> allGames.add(game));
		return allGames;
	}

	public Game getGameById(Integer id) {
		return gameRepository.findById(id).get();
	}
	
	public boolean saveOrUpdate(List<Game> games) {
		gameRepository.saveAll(games);
		return true;
	}

	@DeleteMapping("/{id}")
	public boolean deleteGameById(Integer id) {
		gameRepository.deleteById(id);
		return true;
	}


}
