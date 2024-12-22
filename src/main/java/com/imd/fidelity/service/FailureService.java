package com.imd.fidelity.service;

import java.util.Random;
import org.springframework.stereotype.Service;
import com.imd.fidelity.model.Failure;

@Service
public class FailureService {

    private final Failure failure;
    private boolean isError = false;  // Estado da falha
    private long errorStartTime = 0;  // Tempo em que a falha foi ativada

    // Configuração da falha de tipo "Timeout", probabilidade 10%, duração de 30 segundos
    public FailureService() {
        this.failure = new Failure("Timeout", 0.1, 30000);  // Probabilidade 10%, falha dura 30s
    }

    /**
     * Simula uma falha de tipo "Timeout" com base na probabilidade e duração.
     */
    public void simulateFailure() {
        if (isError && System.currentTimeMillis() - errorStartTime < failure.getDuration()) {
            // Simula o timeout (2 segundos) antes de lançar a falha
            try {
                Thread.sleep(2000);  // Dorme por 2 segundos para simular o timeout
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            throw new RuntimeException("Simulated Timeout: The operation has timed out.");
        }

        Random random = new Random();
        if (!isError && random.nextDouble() < failure.getProbability()) {
            isError = true;
            errorStartTime = System.currentTimeMillis();
            try {
                Thread.sleep(2000);  // Dorme por 2 segundos para simular o timeout
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            throw new RuntimeException("Simulated Timeout: The operation has timed out.");
        }
    }

    /**
     * Reseta o estado da falha.
     */
    public void resetFailure() {
        isError = false;
    }
}
