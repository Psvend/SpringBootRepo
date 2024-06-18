package com.RR.demo.Service;

import com.RR.demo.Model.Games;
import com.RR.demo.Model.Players;
import com.RR.demo.Repository.GamesRepo;
import com.RR.demo.Repository.PlayersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
public class PlayersService {

    @Autowired
    private PlayersRepo playersRepo;
    @Autowired
    private GamesRepo gamesRepo;


    @Transactional
    public Players addPlayer(Players player) {
      player =  playersRepo.save(player);
      gamesRepo.updateJoinedAmount(player.getGame_id().getGame_id());
      player.setGame_id(gamesRepo.findById(player.getGame_id().getGame_id()).get());
       return player;
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
