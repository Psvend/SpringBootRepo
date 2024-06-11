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
    @Column(name = "ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    @ManyToOne
    @JoinColumn(name = "GAME_ID", referencedColumnName = "ID")
    private Games game_id;

    @Column(name = "PHASE_STATUS")
    private boolean phase_status;
}
