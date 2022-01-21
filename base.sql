-- crear una tabla con los atributos fecha,hora,motivo,sintomas,nombre, apellidos,dni,telefono,direccion,email,fecha_nacimiento,sexo,observaciones 
drop database if exists scitas;
create database scitas;
use scitas;

CREATE TABLE paciente(
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
  sexo VARCHAR(50) NOT NULL
);