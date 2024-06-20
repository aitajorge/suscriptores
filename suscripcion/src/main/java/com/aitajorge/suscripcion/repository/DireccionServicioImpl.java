package com.aitajorge.suscripcion.service;

import com.aitajorge.suscripcion.model.Direccion;
import com.aitajorge.suscripcion.repository.DireccionRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DireccionServicioImpl implements DireccionServicio {

    private final DireccionRepository direccionRepository;

    @Autowired
    public DireccionServicioImpl(DireccionRepository direccionRepository) {
        this.direccionRepository = direccionRepository;
    }

    @Override
    @Transactional
    public Direccion guardarDireccion(Direccion direccion) {
        return direccionRepository.save(direccion);
    }

    @Override
    public List<Direccion> buscarTodasDirecciones() {
        return direccionRepository.findAll();
    }

    @Override
    public Direccion buscarDireccionPorId(Long id) {
        Optional<Direccion> direccion = direccionRepository.findById(id);
        return direccion.orElse(null);
    }

    @Override
    public void eliminarDireccion(Long id) {
        direccionRepository.deleteById(id);
    }
}
