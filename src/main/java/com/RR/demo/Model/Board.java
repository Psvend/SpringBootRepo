package com.RR.demo.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "board")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private int boardId;

    @Column(name = "board_name", nullable = false)
    private String boardName;

    // Other properties, getters, setters, constructors, toString, equals, hashCode methods

}
