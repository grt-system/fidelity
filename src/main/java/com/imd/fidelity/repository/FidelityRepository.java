package com.imd.fidelity.repository;

import com.imd.fidelity.model.Fidelity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  FidelityRepository  extends JpaRepository<Fidelity, Long> {
}
