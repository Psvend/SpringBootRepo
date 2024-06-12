package com.RR.demo.Model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Petrine
 */


@Entity
@Data
@Table(name = "progCard")
@NoArgsConstructor
@AllArgsConstructor
public class ProgCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Card_Id")
    private int card_id;

    @Column(name = "Type")
    private String type;

    @Column(name = "ExecutedStatus")
    private String executed_status;

    @Column(name = "Action")
    private String action;

    @Column(name = "RegisterNo")
    private String register_no;

    //foreign key player_Id added to ProgCard from Player
    @ManyToOne
    @JoinColumn(name = "Player_ID", referencedColumnName = "Player_Id")
    private Players player_ID;
}