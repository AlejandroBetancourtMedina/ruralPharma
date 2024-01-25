package com.ruralpharma.ruralPharma.repository;

import com.ruralpharma.ruralPharma.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, String> {
}
