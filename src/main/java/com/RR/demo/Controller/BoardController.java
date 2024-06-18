package com.RR.demo.Controller;

import com.RR.demo.Model.Board;
import com.RR.demo.Service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/boards") // Adjust the base path as per your application's API design
public class BoardController {

    @Autowired
    private BoardService boardService;

    @PostMapping("/save")
    public ResponseEntity<Board> saveBoard(@RequestBody Board board) {
        Board savedBoard = boardService.saveBoard(board);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedBoard);
    }

    // Other endpoints related to boards can be added here

}

