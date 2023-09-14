package com.platinum.repository;

import com.platinum.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    // Métodos de consulta personalizados si los necesitas
}
