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

    //foreign key game_id from Games
    @ManyToOne
    @JoinColumn(name = "Game_Id", referencedColumnName = "Game_Id", nullable = false)
    private Games game_id;

    @Column(name = "Phase_Status")
    private boolean phase_status;

    //foreign key player_id from Players
    @OneToMany(mappedBy = "player_id", cascade = CascadeType.ALL)
    private List<ProgCard> progCardList;


}
