package com.ruralpharma.ruralPharma.repository;

import com.ruralpharma.ruralPharma.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
}
