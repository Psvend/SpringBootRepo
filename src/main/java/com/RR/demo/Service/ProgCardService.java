package com.RR.demo.Service;

import com.RR.demo.Model.ProgCard;
import com.RR.demo.Repository.ProgCardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgCardService {

    @Autowired
    private ProgCardRepo progCardRepo;

    //tilføjer kort til register
    public ProgCard addCard(ProgCard progCard) {
        return progCardRepo.save(progCard);
    }
}



