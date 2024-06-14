package com.RR.demo.Controller;

import com.RR.demo.Model.Board;
import com.RR.demo.Service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Petrine
 */

@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

    @PostMapping("/saveBoard")
    public Board saveBoard(@RequestBody Board board){
        return boardService.saveBoard(board);
    }

}
