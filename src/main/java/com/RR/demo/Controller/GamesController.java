package com.RR.demo.Controller;

import com.RR.demo.Model.Games;
import com.RR.demo.Service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GamesController {

    @Autowired
    private GamesService gamesService;

    @PostMapping("/save")
    public ResponseEntity<Games> saveGame(@RequestBody Games game) {
        Games savedGame = gamesService.saveGame(game);
        return ResponseEntity.ok().body(savedGame);
    }

    @PostMapping("/create")
    public ResponseEntity<Games> createGame(@RequestBody Games game) {
        Games newGame = gamesService.createGame(game);
        return ResponseEntity.ok().body(newGame);
    }

    @GetMapping("/available/{gameStatus}")
    public ResponseEntity<List<Games>> getAvailableGames(@PathVariable int gameStatus) {
        List<Games> availableGames = gamesService.getAvailableGames(gameStatus);
        return ResponseEntity.ok().body(availableGames);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Games>> getAllGames() {
        List<Games> games = gamesService.getAllGames();
        return ResponseEntity.ok().body(games);
    }

    @GetMapping("/{gameId}")
    public ResponseEntity<Games> getGameById(@PathVariable int gameId) {
        Games game = gamesService.getGameById(gameId);
        if (game != null) {
            return ResponseEntity.ok().body(game);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/start")
    public ResponseEntity<Games> startGame(@RequestBody Games game) {
        gamesService.startGame(game, game.getJoinedPlayers());
        return ResponseEntity.ok().body(game);
    }

    // Other endpoints related to games can be added here

}
