package com.RR.demo.Model;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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

}