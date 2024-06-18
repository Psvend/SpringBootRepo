package com.RR.demo.Service;

import com.RR.demo.Model.Board;
import com.RR.demo.Model.Games;
import com.RR.demo.Repository.BoardRepo;
import com.RR.demo.Repository.GamesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamesService {

  @Autowired
  private GamesRepo gamesRepo;

  @Autowired
  private BoardRepo boardRepo;

  public Games saveGame(Games game) {
    return gamesRepo.save(game);
  }

  public Games createGame(Games game) {
    // Ensure the board is persisted before saving the game
    if (game.getBoard() != null) {
      Board board = boardRepo.findById(game.getBoard().getBoardId()).orElse(game.getBoard());
      game.setBoard(board);
    }
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

  // Sets the game status to start when all players are ready
  public void startGame(Games game, int joinedPlayers) {
    game.setGameStatus(1);
    gamesRepo.save(game);
  }
}
