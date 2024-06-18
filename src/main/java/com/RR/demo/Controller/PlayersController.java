package com.RR.demo.Controller;

import com.RR.demo.Model.Players;
import com.RR.demo.Service.PlayersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayersController {
    @Autowired
    private PlayersService playersService;

    //This end point is used to create a new player.
    @PostMapping("/addPlayer")
    public Players addPlayer(@RequestBody Players player){
        return playersService.addPlayer(player);
    }
}
