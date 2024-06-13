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
@Table(name = "Board")
@NoArgsConstructor
@AllArgsConstructor
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Board_Id")
    private int board_id;

    @Column(name = "Board_name")
    private String board_name;

    @OneToMany(mappedBy = "board_id", cascade = CascadeType.ALL)
    private List<Games> gamesList;

}
