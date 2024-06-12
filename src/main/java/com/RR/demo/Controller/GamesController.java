package com.RR.demo.Controller;

import com.RR.demo.Model.Games;
import com.RR.demo.Service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GamesController {
    @Autowired
    private GamesService gamesService;

    @PostMapping("/addGame")
    public Games postGame(@RequestBody Games game){
        return gamesService.saveGame(game);
    }

    //This end point is used to create a new game.
    //It takes a JSON object with Game's Name and Amount of players as parameters and returns the created game.
    @PostMapping("/createGame")
    public Games createGame(@RequestBody Games game){
        return gamesService.saveGame(game);
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