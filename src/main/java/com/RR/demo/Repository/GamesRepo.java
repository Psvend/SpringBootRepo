package com.RR.demo.Repository;

import com.RR.demo.Model.Games;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamesRepo extends JpaRepository<Games, Integer> {
}
