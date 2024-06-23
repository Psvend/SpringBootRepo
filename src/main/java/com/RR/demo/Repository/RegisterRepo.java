package com.RR.demo.Repository;

import com.RR.demo.Model.Players;
import com.RR.demo.Model.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Petrine
 */
public interface RegisterRepo extends JpaRepository<Register, String> {

    @Query(value = "SELECT r.* FROM Register r INNER JOIN players p ON r.Player_Id = p.Player_Id WHERE p.Game_Id = :game_id", nativeQuery = true)
    public List<Register> findRegistersByGameId(@Param("game_id") int game_id);

}