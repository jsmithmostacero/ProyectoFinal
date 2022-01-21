-- crear una tabla con los atributos fecha,hora,motivo,sintomas,nombre, apellidos,dni,telefono,direccion,email,fecha_nacimiento,sexo,observaciones 
use database rCitas;

CREATE TABLE paciente(
  
  fecha VARCHAR(50) NOT NULL,
  hora VARCHAR(50) NOT NULL,
  motivo VARCHAR(50) NOT NULL,
  sintomas VARCHAR(50) NOT NULL,
  nombre VARCHAR(50) NOT NULL,
  apellidos VARCHAR(50) NOT NULL,
  dni VARCHAR(50) NOT NULL,
  telefono VARCHAR(50) NOT NULL,
  direccion VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL,
  fecha_nacimiento VARCHAR(50) NOT NULL,
  sexo VARCHAR(50) NOT NULL,
);
--insertar datos en pacientes de prueba
INSERT INTO paciente(fecha,hora,motivo,sintomas,nombre,apellidos,dni
,telefono,direccion,email,fecha_nacimiento,sexo) 
VALUES('2020-01-01','10:00:00','consulta','fiebre','juan','perez','
12345678','12345678','calle','Hipolito Unanue Mz k','2020-01-01','masculino');
INSERT INTO paciente(fecha,hora,motivo,sintomas,nombre,apellidos,dni
,telefono,direccion,email,fecha_nacimiento,sexo)
VALUES('2020-01-01','10:00:00','consulta','fiebre','Rosa','vargas','
12345678','12345678','calle','Hipolito Unanue Mz k','2020-01-01','masculino');


  

