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
    private int playerId;

    @Column(name = "Player_name", nullable = false)
    private String playerName;

    @Column(name = "Phase_Status")
    private boolean phaseStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Game_Id", referencedColumnName = "game_id", nullable = false)
    private Games game;

    //foreign key player_Id fra Register
    /*@OneToMany(mappedBy = "player_id", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Players> playerList;*/

}
