package com.RR.demo.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "players")
@NoArgsConstructor
@AllArgsConstructor
public class Players {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Player_Id")
    private int player_id;

    @Column(name = "Player_name", nullable = false)
    private String player_name;

    //tracks whether a player is ready or done with the action
    @Column(name = "Phase_Status", nullable = true)
    private boolean phase_status;

    //foreign key game_id from Games
    @ManyToOne
    @JoinColumn(name = "Game_Id", referencedColumnName = "Game_Id", nullable = false)
    private Games game_id;

    public int getGameID() {
        return game_id.getGame_id();
    }

}
