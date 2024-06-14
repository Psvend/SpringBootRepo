package com.RR.demo.Repository;

import com.RR.demo.Model.Games;
import com.RR.demo.Model.Players;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayersRepo extends JpaRepository<Players, Integer> {
}
