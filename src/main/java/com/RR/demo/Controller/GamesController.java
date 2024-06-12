package com.RR.demo.Controller;

import com.RR.demo.Model.Games;
import com.RR.demo.Service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GamesController {
    @Autowired
    private GamesService gamesService;

    @PostMapping("/addGame")
    public Games postGame(@RequestBody Games game){
        return gamesService.saveGame(game);
    }
}