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
    @Column(name = "ID")
    private int id;

    @Column(name = "Type")
    private String name;

    @Column(name = "ExecutedStatus")
    private String executed_status;

    @Column(name = "Action")
    private String action;

    @Column(name = "RegisterNo")
    private String register_no;

}