package com.RR.demo.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    @Column(name = "Player_name")
    private String player_name;

    @ManyToOne
    @JoinColumn(name = "Game_Id", referencedColumnName = "Game_Id")
    private Games game_id;

    @Column(name = "Phase_Status")
    private boolean phase_status;
}
