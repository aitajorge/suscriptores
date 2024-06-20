package com.aitajorge.suscripcion.repository;

import com.aitajorge.suscripcion.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
    Persona findByDni(String dni);
}
