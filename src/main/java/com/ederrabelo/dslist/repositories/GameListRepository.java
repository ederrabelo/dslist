package com.ederrabelo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ederrabelo.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
