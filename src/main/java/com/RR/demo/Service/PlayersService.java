package com.RR.demo.Service;

import com.RR.demo.Model.Games;
import com.RR.demo.Model.Players;
import com.RR.demo.Repository.GamesRepo;
import com.RR.demo.Repository.PlayersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

import java.util.List;

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

    public List<Players> findJoinedPlayers(int game_id){


        return playersRepo.findJoinedPlayers(game_id);
    }

}
