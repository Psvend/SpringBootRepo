package com.RR.demo.Controller;

import com.RR.demo.Model.Games;
import com.RR.demo.Service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GamesController {
    @Autowired
    private GamesService gamesService;

    @PostMapping("/saveGame")
    public Games saveGame(@RequestBody Games game){
        return gamesService.saveGame(game);
    }

    //This end point is used to create a new game.
    //It takes a JSON object with Game's Name and Amount of players as parameters.
    @PostMapping("/createGame")
    public ResponseEntity<Games> createGame(@RequestBody Games game){
        Games newGame=gamesService.createGame(game);
        return ResponseEntity.ok().body(newGame);
    }

    //Posts when a player has pressed the start button in the lobby
    @PostMapping("/startGame")
    public ResponseEntity<Games> startGame(@RequestBody Games game) {
        gamesService.startGame(game, game.getJoined_players());
        return ResponseEntity.ok().body(game);
    }



    //JOIN
   @GetMapping("/availableGames/{game_status}")
    //list of games that have game_status = 0
    public ResponseEntity<List<Games>> getAvailableGames(@PathVariable int game_status){
        List<Games> availableGames = gamesService.getAvailableGames(game_status);
        return ResponseEntity.ok().body(availableGames);
    }


    @GetMapping("/getGames")
    public List<Games> getGames(){
        return gamesService.getAllGames();
    }

    @GetMapping("/getGameById/{game_id}")
    public Games getGameById(@PathVariable int game_id){
        return gamesService.getGameById(game_id);
    }
}