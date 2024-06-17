package com.RR.demo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@Table(name = "Register")
@NoArgsConstructor
@AllArgsConstructor
public class Register {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Register_Id")
    private int register_id;

    @Column(name = "Register_Name")
    private String register_name;

    //foreign key register_id from Players
    @ManyToOne
    @JoinColumn(name = "Player_Id", referencedColumnName = "Player_Id", nullable = false)
    private Players player_id;

    //foreign key card_id from Card
    @ManyToOne
    @JoinColumn(name = "Card_Id", referencedColumnName = "Card_Id", nullable = false)
    private ProgCard progCard;



}