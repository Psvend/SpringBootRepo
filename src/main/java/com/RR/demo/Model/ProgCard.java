package com.RR.demo.Model;
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

    @Column(name = "Card_name")
    private String card_name;

    @Column(name = "Type")
    private String type;

    @Column(name = "ExecutedStatus")
    private String executed_status;

    @Column(name = "Action")
    private String action;

    //foreign key card_id
   /* @OneToMany(mappedBy = "card_id" , cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProgCard> progCardListList;*/

}