package com.aitajorge.suscripcion.service;

import com.aitajorge.suscripcion.model.Direccion;

import java.util.List;

public interface DireccionServicio {

    Direccion guardarDireccion(Direccion direccion);

    List<Direccion> buscarTodasDirecciones();

    Direccion buscarDireccionPorId(Long id);

    void eliminarDireccion(Long id);
}
