
drop database if exists scitas;
create database scitas;
use scitas;

CREATE TABLE paciente(
  id int not null,
  fecha VARCHAR(50) NOT NULL,
  hora VARCHAR(50) NOT NULL,
  motivo VARCHAR(50) NOT NULL,
  sintomas VARCHAR(50) NOT NULL,
  nombre VARCHAR(50) NOT NULL,
  apellidos VARCHAR(50) NOT NULL,
  dni VARCHAR(8) NOT NULL,
  telefono VARCHAR(50) NOT NULL,
  direccion VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL,
  fecha_nacimiento VARCHAR(50) NOT NULL,
  sexo VARCHAR(50) NOT NULL,
  PRIMARY key(id)
);