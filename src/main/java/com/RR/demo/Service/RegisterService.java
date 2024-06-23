package com.RR.demo.Service;

import com.RR.demo.Model.Register;
import com.RR.demo.Repository.RegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Petrine
 */

@Service
public class RegisterService {

    @Autowired
    private RegisterRepo registerRepo;

    public void saveRegister(ArrayList<Register> registers) {
        registerRepo.saveAll(registers);
    }

    public List<Register> findRegistersByGameId(int game_id) {
        return registerRepo.findRegistersByGameId(game_id);
    }
}
