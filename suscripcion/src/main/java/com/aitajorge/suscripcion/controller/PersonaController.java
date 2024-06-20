package com.aitajorge.suscripcion.controller;

import com.aitajorge.suscripcion.model.Persona;
import com.aitajorge.suscripcion.model.PersonaConDireccion;
import com.aitajorge.suscripcion.service.PersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.ZoneId;
import java.util.ArrayList;
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

//    @GetMapping
//    public  List<Persona> listarPersonas(){
//        return personaServicio.buscarTodasPersonas();
//    }

    // PersonaController.java
    @GetMapping("/con-direcciones")
    public List<PersonaConDireccion> listarPersonasConDirecciones() {
        List<Persona> personas = personaServicio.buscarTodasPersonas();
        List<PersonaConDireccion> personasConDirecciones = new ArrayList<>();

        for (Persona persona : personas) {
            PersonaConDireccion personaConDireccion = new PersonaConDireccion();
            personaConDireccion.setId(persona.getId());
            personaConDireccion.setNombre(persona.getNombre());
            personaConDireccion.setApellido(persona.getApellido());
            personaConDireccion.setDni(persona.getDni());
            personaConDireccion.setNacimiento(persona.getNacimiento().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            personaConDireccion.setDireccion(persona.getDireccion());
            personasConDirecciones.add(personaConDireccion);
        }

        return personasConDirecciones;
    }

}
