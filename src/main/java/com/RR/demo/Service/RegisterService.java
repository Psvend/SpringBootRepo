package com.RR.demo.Service;

import com.RR.demo.Repository.RegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Petrine
 */

@Service
public class RegisterService {

    @Autowired
    private RegisterRepo registerRepo;
}
