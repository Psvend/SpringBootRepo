package com.RR.demo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@Table(name = "games")
@NoArgsConstructor
@AllArgsConstructor
public class Games {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Game_Id")
    private int game_id;

    @Column(name = "Game_name" , nullable = false)
    private String game_name;

    @Column(name = "Players_amount", nullable = false)
    private int players_amount;

    @Column(name = "Joined_players")
    private int joined_players;

    //It is used to store the status of the game 0 for not started, 1 for started and 2 for finished.
    @Column(name = "Game_status")
    private int game_status;

    //foreign key board_id
    @ManyToOne
    @JoinColumn(name = "Board_Id", referencedColumnName = "Board_Id")
    private Board board_id;

}
