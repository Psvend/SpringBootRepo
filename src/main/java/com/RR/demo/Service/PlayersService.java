package com.RR.demo.Service;

import com.RR.demo.Model.Games;
import com.RR.demo.Model.Players;
import com.RR.demo.Repository.GamesRepo;
import com.RR.demo.Repository.PlayersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayersService {

    @Autowired
    private PlayersRepo playersRepo;
    @Autowired
    private GamesRepo gamesRepo;



    public Players addPlayer(Players player) {
      player =  playersRepo.save(player);
      gamesRepo.updateJoinedAmount(player.getGame_id().getGame_id());
      return player;
    }

}
