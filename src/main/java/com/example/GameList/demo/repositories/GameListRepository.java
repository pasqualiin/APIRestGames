package com.example.GameList.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.GameList.demo.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
