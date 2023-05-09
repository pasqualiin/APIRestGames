package com.example.GameList.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.GameList.demo.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
