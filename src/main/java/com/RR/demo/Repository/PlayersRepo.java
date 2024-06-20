package com.RR.demo.Repository;

import com.RR.demo.Model.Games;
import com.RR.demo.Model.Players;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlayersRepo extends JpaRepository<Players, Integer> {

    @Query(value = "SELECT * FROM players WHERE game_id=:game_id", nativeQuery = true)
    public List<Players> findJoinedPlayers(@Param("game_id") int game_id);
}
