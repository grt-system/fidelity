package com.imd.fidelity.service;

import com.imd.fidelity.repository.FidelityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FidelityService {

    @Autowired
    private FidelityRepository fidelityRepository;

    public void calBonus(){}
}
