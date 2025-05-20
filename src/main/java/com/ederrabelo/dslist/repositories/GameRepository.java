package com.ederrabelo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ederrabelo.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
