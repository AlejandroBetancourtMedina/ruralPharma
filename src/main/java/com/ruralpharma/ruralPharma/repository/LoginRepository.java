package com.ruralpharma.ruralPharma.repository;

import com.ruralpharma.ruralPharma.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {
}
