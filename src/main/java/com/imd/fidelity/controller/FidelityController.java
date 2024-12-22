package com.imd.fidelity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.imd.fidelity.model.Fidelity;
import com.imd.fidelity.service.FidelityService;
import com.imd.fidelity.service.FailureService; // Importa a classe FailureService

@RestController
@RequestMapping("/api/fidelity")
public class FidelityController {

    @Autowired
    private FidelityService fidelityService;

    @Autowired
    private FailureService failureService;  // Injetando a classe de falha

    @PostMapping("/bonus")
    public ResponseEntity<?> getBonus(@RequestBody Fidelity request) {
        try {
            // Simula uma falha antes de processar o bônus
            failureService.simulateFailure();  // Aciona a falha (simula timeout ou erro)

            // Processa o bônus se não houver falha
            String result = fidelityService.processBonus(request);
            return ResponseEntity.ok().body(result);
        } catch (RuntimeException e) {
            // Se ocorrer uma falha simulada
            return ResponseEntity.status(500).body("Error: " + e.getMessage());
        }
    }
}
