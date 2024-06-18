package com.RR.demo.Service;


import com.RR.demo.Model.Games;
import com.RR.demo.Model.Players;
import com.RR.demo.Repository.GamesRepo;
import com.RR.demo.Repository.PlayersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class GamesService {
  @Autowired
  private GamesRepo gamesRepo;
    public Games saveGame(Games game) {
      game.setGame_name(game.getGame_name());
      game.setPlayers_amount(game.getPlayers_amount());
      return gamesRepo.save(game);
    }

    public Games createGame(Games game) {
    return gamesRepo.save(game);
    }

   public List<Games> getAvailableGames(int game_status){
    return gamesRepo.findByGameStatus(game_status);
  }


    public List<Games> getAllGames() {
      return gamesRepo.findAll();
    }

    public Games getGameById(int game_id) {
      return gamesRepo.findById(game_id).orElse(null);
    }

    //sets the game status to start when all players are ready
    public void startGame(Games game, int joinedPlayers) {
      game.setGame_status(1);
      gamesRepo.save(game);
    }




    //



}
