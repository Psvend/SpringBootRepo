package com.RR.demo.Controller;

import com.RR.demo.Service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/players")
public class PlayersController {
    @Autowired
    private GamesService gamesService;

    @PostMapping("/{playerId}/ready")
    public ResponseEntity<String> playerReady(@PathVariable int player_id) {
        gamesService.playerReady(player_id);
        return ResponseEntity.ok("Player marked as ready");
    }



}