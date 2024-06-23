package com.RR.demo.Model;


import com.RR.demo.Repository.ProgCardRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProgCardsInitializer {
    private final ProgCardRepo progCardRepo;

    public ProgCardsInitializer(ProgCardRepo progCardRepo) {
        this.progCardRepo = progCardRepo;
    }

    @PostConstruct
    public void initData() {
        List<ProgCard> progCards = List.of(
                new ProgCard(1, "Fwd", "Not Executed", "Fwd"),
                new ProgCard(2, "Bwd", "Not Executed", "Bwd"),
                new ProgCard(3, "2x Fwd", "Not Executed", "2x Fwd"),
                new ProgCard(4, "3x Fwd", "Not Executed", "3x Fwd"),
                new ProgCard(5, "Turn Right", "Not Executed", "Turn Right"),
                new ProgCard(6, "Turn Left", "Not Executed", "Turn Left"),
                new ProgCard(7, "U-turn", "Not Executed", "U-turn"),
                new ProgCard(8, "Fast Fwd", "Not Executed", "Fast Fwd"),
                new ProgCard(9, "Prvs commnd", "Not Executed", "Prvs commnd"),
                new ProgCard(10, "Power Up", "Not Executed", "Power Up")
        );

        progCardRepo.saveAll(progCards);
    }
}
