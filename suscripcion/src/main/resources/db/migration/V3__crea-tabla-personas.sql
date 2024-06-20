CREATE TABLE personas (
    id SERIAL PRIMARY KEY,
    apellido VARCHAR(255) NOT NULL,
    nombre VARCHAR(255) NOT NULL,
    dni VARCHAR(20) NOT NULL,
    nacimiento DATE NOT NULL,
    direccion_id INT,
    CONSTRAINT fk_direccion_id FOREIGN KEY (direccion_id) REFERENCES direcciones(id)
);
