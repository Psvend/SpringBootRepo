package com.RR.demo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


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

    @Column(name = "Game_name")
    private String game_name;

    @Column(name = "Players_amount")
    private int players_amount;

    @Column(name = "Game_status")
    private int game_status;

    public void setGame_name(String game_name) {
        if(game_name == null) {
            throw new IllegalArgumentException("game_name cannot be null");
        }
        this.game_name = game_name;
    }
}
