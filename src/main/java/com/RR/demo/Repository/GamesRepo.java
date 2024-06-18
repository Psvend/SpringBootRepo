package com.RR.demo.Repository;

import com.RR.demo.Model.Games;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GamesRepo extends JpaRepository<Games, Integer> {

    //Costume Query
    //Find by game_status
    @Query(value = "SELECT all FROM Games all WHERE game_status=:status")
    public List<Games> findByGameStatus(@Param("status") int game_status);

    @Transactional
    @Modifying
    @Query(value = "UPDATE Games SET joined_players = joined_players + 1 WHERE game_id=:game_id", nativeQuery = true)
    public void updateJoinedAmount(@Param("game_id") int game_id);


}
