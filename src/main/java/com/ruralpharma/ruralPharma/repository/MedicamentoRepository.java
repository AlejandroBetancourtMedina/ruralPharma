package com.ruralpharma.ruralPharma.repository;

import com.ruralpharma.ruralPharma.entity.Medicamento;
import com.ruralpharma.ruralPharma.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

@Repository
public interface MedicamentoRepository extends  JpaRepository<Medicamento, Integer> {
}

