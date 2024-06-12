package com.RR.demo.Service;


import com.RR.demo.Model.Games;
import com.RR.demo.Repository.GamesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamesService {
  @Autowired
  private GamesRepo gamesRepo;

    public Games saveGame(Games game) {
      game.setGame_name(game.getGame_name());
      game.setPlayers_amount(game.getPlayers_amount());
      return gamesRepo.save(game);
    }

    public List<Games> getAllGames() {
      return gamesRepo.findAll();
    }

    public Games getGameById(int game_id) {
      return gamesRepo.findById(game_id).orElse(null);
    }
}
