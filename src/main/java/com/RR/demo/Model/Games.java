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
    @Column(name = "ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PLAYERS_AMOUNT")
    private int players_amount;

    @Column(name = "GAME_STATUS")
    private int game_status;
}
