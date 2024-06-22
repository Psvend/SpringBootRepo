package com.RR.demo.Controller;

import com.RR.demo.Model.Register;
import com.RR.demo.Service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping("/registerPost")
    public ResponseEntity<List<Register>> saveRegister(@RequestBody List<Register> registers) {
        return ResponseEntity.ok(registerService.saveRegister(registers));
    }

    @GetMapping("/registerGet/{game_id}")
    public ResponseEntity<List<Register>> getRegisters(@PathVariable int game_id) {
        return ResponseEntity.ok(registerService.findRegistersByGameId(game_id));
    }


}
