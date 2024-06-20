package com.aitajorge.suscripcion.controller;

import com.aitajorge.suscripcion.model.Direccion;
import com.aitajorge.suscripcion.service.DireccionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/direcciones")
public class DireccionController {

    private final DireccionServicio direccionServicio;

    @Autowired
    public DireccionController(DireccionServicio direccionServicio) {
        this.direccionServicio = direccionServicio;
    }

    @PostMapping
    public ResponseEntity<Direccion> guardarDireccion(@RequestBody Direccion direccion) {
        Direccion direccionGuardada = direccionServicio.guardarDireccion(direccion);
        return ResponseEntity.ok(direccionGuardada);
    }

    @GetMapping
    public ResponseEntity<List<Direccion>> buscarTodasDirecciones() {
        List<Direccion> direcciones = direccionServicio.buscarTodasDirecciones();
        return ResponseEntity.ok(direcciones);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Direccion> buscarDireccionPorId(@PathVariable Long id) {
        Direccion direccion = direccionServicio.buscarDireccionPorId(id);
        if (direccion != null) {
            return ResponseEntity.ok(direccion);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarDireccion(@PathVariable Long id) {
        direccionServicio.eliminarDireccion(id);
        return ResponseEntity.noContent().build();
    }
}
