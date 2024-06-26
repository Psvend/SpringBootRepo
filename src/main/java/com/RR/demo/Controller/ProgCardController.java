package com.RR.demo.Controller;

import com.RR.demo.Service.ProgCardService;
import com.RR.demo.Model.ProgCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Petrine
 */
@RestController
public class ProgCardController {
    @Autowired
    private ProgCardService progCardService;


    @PostMapping("/addCard")
    public ProgCard addCard(@RequestBody ProgCard progCard){
        return progCardService.addCard(progCard);
    }

}

