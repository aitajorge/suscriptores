package com.aitajorge.suscripcion.model;

import jakarta.persistence.*;

@Entity
@Table(name = "direcciones")
public class Direccion {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String calle;
        private String ciudad;
        private String codigoPostal;

        public Direccion() {
                // Constructor vacío requerido por JPA
        }

        public Direccion(String calle, String ciudad, String codigoPostal) {
                this.calle = calle;
                this.ciudad = ciudad;
                this.codigoPostal = codigoPostal;
        }

        // Getters y setters
        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getCalle() {
                return calle;
        }

        public void setCalle(String calle) {
                this.calle = calle;
        }

        public String getCiudad() {
                return ciudad;
        }

        public void setCiudad(String ciudad) {
                this.ciudad = ciudad;
        }

        public String getCodigoPostal() {
                return codigoPostal;
        }

        public void setCodigoPostal(String codigoPostal) {
                this.codigoPostal = codigoPostal;
        }
}
