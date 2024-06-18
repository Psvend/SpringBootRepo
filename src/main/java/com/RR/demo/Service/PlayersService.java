package com.RR.demo.Service;

import com.RR.demo.Model.Players;
import com.RR.demo.Repository.PlayersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayersService {

    @Autowired
    private PlayersRepo playersRepo;

    public Players addPlayer(Players player) {
      return playersRepo.save(player);
    }

    /* public void playerReady(int player_id) {
      Players player = playersRepo.findById(player_id).orElseThrow(null);
      player.setPhase_status(true);
      playersRepo.save(player);

      Games game = player.getGame_id();
      boolean allReady = game.getPlayersList().stream().allMatch(Players::isPhase_status);

      if(allReady) {
        startGame(game, game.getJoined_players());
      }
    }*/


}
