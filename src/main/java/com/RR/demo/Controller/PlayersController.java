package com.RR.demo.Controller;

import com.RR.demo.Model.Games;
import com.RR.demo.Model.Players;
import com.RR.demo.Service.GamesService;
import com.RR.demo.Service.PlayersService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayersController {
    @Autowired
    private PlayersService playersService;
    @Autowired
    private GamesService gamesService;

    //This end point is used to create a new player.
    @PostMapping("/addPlayer")
    public Players addPlayer(@RequestBody Players player){
        return playersService.addPlayer(player);
    }

    @GetMapping("/findJoinedPlayers/{game_id}")
    public List<Players> getJoinedPlayers(@PathVariable int game_id){
        return playersService.findJoinedPlayers(game_id);
    }
}
