package com.imd.fidelity.service;

import org.springframework.stereotype.Service;
import com.imd.fidelity.model.Fidelity;

@Service
public class FidelityService {

    public String processBonus(Fidelity request) {
        // Lógica para processar o bônus normalmente
        return "Bonus processed successfully for user " + request.getId();
    }
}
