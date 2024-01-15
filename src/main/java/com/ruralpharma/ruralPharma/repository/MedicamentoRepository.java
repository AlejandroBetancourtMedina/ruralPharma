package com.ruralpharma.ruralPharma.repository;

import com.ruralpharma.ruralPharma.entity.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentoRepository extends  JpaRepository<Medicamento, Integer> {
}

