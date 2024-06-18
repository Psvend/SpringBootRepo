package com.RR.demo.Repository;

import com.RR.demo.Model.Games;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GamesRepo extends JpaRepository<Games, Integer> {

    //Costume Query
    //Find by game_status
    @Query(value = "SELECT all FROM Games all WHERE game_status=:status")
    public List<Games> findByGameStatus(@Param("status") int game_status);

    //Find amount of joined players


}
