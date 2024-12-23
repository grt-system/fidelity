package com.imd.fidelity.service;

import org.springframework.stereotype.Service;
import com.imd.fidelity.model.Fidelity;

@Service
public class FidelityService {

    public String processBonus(long id, double value) {
        // Lógica para processar o bônus normalmente
        return "Bonus processed successfully for user " + id;
    }
}
