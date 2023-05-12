package com.example.GameList.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.GameList.demo.dto.GameDTO;
import com.example.GameList.demo.dto.GameMinDTO;
import com.example.GameList.demo.entities.Game;
import com.example.GameList.demo.repositories.GameRepository;

import jakarta.transaction.Transactional;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}

	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
