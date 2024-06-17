package com.RR.demo.Controller;

import com.RR.demo.Service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Petrine
 */
@RestController
public class RegisterController {
    @Autowired
    private RegisterService registerService;


}
