package com.RR.demo.Service;


import com.RR.demo.Model.Games;
import com.RR.demo.Repository.GamesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GamesService {
  @Autowired
  private GamesRepo gamesRepo;

    public Games saveGame(Games game) {
      return gamesRepo.save(game);
    }
}
