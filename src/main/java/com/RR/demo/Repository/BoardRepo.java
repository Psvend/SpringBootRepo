package com.RR.demo.Repository;

import com.RR.demo.Model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepo extends JpaRepository<Board, Integer> {
}
