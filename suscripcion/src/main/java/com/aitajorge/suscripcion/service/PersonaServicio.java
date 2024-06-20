package com.aitajorge.suscripcion.service;

import com.aitajorge.suscripcion.model.Persona;
import com.aitajorge.suscripcion.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonaServicio {

    private final PersonaRepository personaRepository;

    @Autowired
    public PersonaServicio(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @Transactional // Asegura que la transacción esté bien definida
    public Persona guardarPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    public List<Persona> buscarTodasPersonas() {
        return personaRepository.findAll();
    }

    public Persona buscarPersonaPorDni(String dni) {
        return personaRepository.findByDni(dni);
    }

    public void eliminarPersona(Long id) {
        personaRepository.deleteById(id);
    }
}
