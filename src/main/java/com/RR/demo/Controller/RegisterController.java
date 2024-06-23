package com.RR.demo.Controller;

import com.RR.demo.Model.Register;
import com.RR.demo.Service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Petrine
 */
@RestController
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    @PostMapping("/addRegisters")
    public ResponseEntity<ArrayList> saveRegister(@RequestBody ArrayList<Register> registers) {
        registerService.saveRegister(registers);
        return ResponseEntity.ok().body(registers);
    }

    @GetMapping("/registerGet/{game_id}")
    public ResponseEntity<List<Register>> getRegisters(@PathVariable int game_id) {
        return ResponseEntity.ok(registerService.findRegistersByGameId(game_id));
    }


}
