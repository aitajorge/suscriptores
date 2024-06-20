package com.aitajorge.suscripcion.repository;

import com.aitajorge.suscripcion.model.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonaRepositoryImpl {

    @PersistenceContext
    private EntityManager entityManager;

    // Implementación de métodos personalizados si es necesario
    public List<Persona> buscarPersonasPorNombre(String nombre) {
        String jpql = "SELECT p FROM Persona p WHERE p.nombre = :nombre";
        TypedQuery<Persona> query = entityManager.createQuery(jpql, Persona.class);
        query.setParameter("nombre", nombre);
        return query.getResultList();
    }

    // Otros métodos personalizados si los tienes
}
