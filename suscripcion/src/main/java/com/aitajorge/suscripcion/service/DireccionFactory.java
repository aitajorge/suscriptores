package com.aitajorge.suscripcion.service;

import com.aitajorge.suscripcion.model.Direccion;

public class DireccionFactory {

    public static Direccion crearDireccion(String calle, String ciudad, String codigoPostal) {
        return new Direccion(calle, ciudad, codigoPostal);
    }
}
