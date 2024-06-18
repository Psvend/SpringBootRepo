package com.RR.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.RR.demo.Model.Board;

/**
 * @author Petrine
 */

public interface BoardRepo extends JpaRepository<Board, Integer> {
}
