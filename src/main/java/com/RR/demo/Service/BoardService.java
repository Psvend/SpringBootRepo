package com.RR.demo.Service;

import com.RR.demo.Model.Board;
import com.RR.demo.Repository.BoardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepo boardRepo;

    public Board saveBoard(Board board) {
        return boardRepo.save(board);
    }

}

