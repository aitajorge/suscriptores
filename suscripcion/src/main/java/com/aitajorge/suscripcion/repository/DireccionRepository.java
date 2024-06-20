package com.aitajorge.suscripcion.repository;

import com.aitajorge.suscripcion.model.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DireccionRepository extends JpaRepository<Direccion, Long> {

    // Puedes definir métodos adicionales específicos si los necesitas
}
