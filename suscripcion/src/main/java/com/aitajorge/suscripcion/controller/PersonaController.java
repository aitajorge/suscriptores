package com.aitajorge.suscripcion.controller;

import com.aitajorge.suscripcion.model.Persona;
import com.aitajorge.suscripcion.service.PersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    private final PersonaServicio personaServicio;

    @Autowired
    public PersonaController(PersonaServicio personaServicio) {
        this.personaServicio = personaServicio;
    }

    @PostMapping
    public Persona guardarPersona(@RequestBody Persona persona) {
        return personaServicio.guardarPersona(persona);
    }

    @GetMapping
    public List<Persona> buscarTodasPersonas() {
        return personaServicio.buscarTodasPersonas();
    }

    @GetMapping("/{dni}")
    public Persona buscarPersonaPorDni(@PathVariable String dni) {
        return personaServicio.buscarPersonaPorDni(dni);
    }

    @DeleteMapping("/{id}")
    public void eliminarPersona(@PathVariable Long id) {
        personaServicio.eliminarPersona(id);
    }
}
