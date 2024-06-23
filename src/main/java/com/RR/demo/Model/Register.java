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
    @Column(name = "Registers_Id")
    private int register_id;

    //foreign key register_id from Players
    @ManyToOne
    @JoinColumn(name = "Player_Id", referencedColumnName = "Player_Id", nullable = false)
    private Players player_id;

    //foreign key card_id from Card
    @ManyToOne
    @JoinColumn(name = "Card_Id", referencedColumnName = "Card_Id")
    private ProgCard card_id;

    @Column(name = "Register_Number", nullable = false)
    private int register_number;


    //1 for executed status of the register and 0 for not executed
    @Column(name = "Register_Status")
    private int register_status;

}