-- Crear tablas
CREATE TABLE ALUMNO (
    LEGAJO INT PRIMARY KEY,
    NOMBRE VARCHAR(50),
    DIRECCIÓN VARCHAR(100),
    EDAD INT,
    CONDICIÓN VARCHAR(10)
);

CREATE TABLE MATERIA (
    CÓDIGO INT PRIMARY KEY,
    NOMBRE VARCHAR(50),
    CARRERA VARCHAR(50),
    FACULTAD VARCHAR(50),
    DURACIÓN VARCHAR(15)
);

CREATE TABLE EXAMEN (
    LEGAJO INT,
    CÓDIGO INT,
    FECHA DATE,
    NOTA DECIMAL(3, 2),
    PRIMARY KEY (LEGAJO, CÓDIGO, FECHA),
    FOREIGN KEY (LEGAJO) REFERENCES ALUMNO(LEGAJO),
    FOREIGN KEY (CÓDIGO) REFERENCES MATERIA(CÓDIGO)
);

-- Insertar datos de ejemplo
INSERT INTO ALUMNO (LEGAJO, NOMBRE, DIRECCIÓN, EDAD, CONDICIÓN) VALUES
(1, 'Juan Perez', 'Calle Falsa 123', 20, 'Regular'),
(2, 'Ana Gomez', 'Avenida Siempre Viva 456', 22, 'Libre');

INSERT INTO MATERIA (CÓDIGO, NOMBRE, CARRERA, FACULTAD, DURACIÓN) VALUES
(101, 'Estadística', 'Licenciatura en Informática', 'Facultad de Ingeniería', 'Anual'),
(102, 'Álgebra', 'Licenciatura en Matemáticas', 'Facultad de Ingeniería', 'Cuatrimestral');

INSERT INTO EXAMEN (LEGAJO, CÓDIGO, FECHA, NOTA) VALUES
(1, 101, '2023-06-15', 9.0),
(2, 101, '2023-06-15', 7.5);

-- a. Listar los legajos, el nombre y apellido de los alumnos que cursan la materia “Estadística” en la carrera “Licenciatura en Informática” de la Facultad de Ingeniería, ordenado por legajo.
SELECT ALUMNO.LEGAJO, ALUMNO.NOMBRE
FROM ALUMNO
JOIN EXAMEN ON ALUMNO.LEGAJO = EXAMEN.LEGAJO
JOIN MATERIA ON EXAMEN.CÓDIGO = MATERIA.CÓDIGO
WHERE MATERIA.NOMBRE = 'Estadística'
  AND MATERIA.CARRERA = 'Licenciatura en Informática'
  AND MATERIA.FACULTAD = 'Facultad de Ingeniería'
ORDER BY ALUMNO.LEGAJO;

-- b. Listar la cantidad de materias por carrera, para la Facultad de Ingeniería, ordenada por código de la carrera.
SELECT CARRERA, COUNT(*) AS Cantidad_Materias
FROM MATERIA
WHERE FACULTAD = 'Facultad de Ingeniería'
GROUP BY CARRERA
ORDER BY CARRERA;

-- c. Listar la nota promedio por alumno, para aquellos promedios superiores a 8 (ocho).
SELECT ALUMNO.LEGAJO, ALUMNO.NOMBRE, AVG(EXAMEN.NOTA) AS Promedio
FROM ALUMNO
JOIN EXAMEN ON ALUMNO.LEGAJO = EXAMEN.LEGAJO
GROUP BY ALUMNO.LEGAJO, ALUMNO.NOMBRE
HAVING AVG(EXAMEN.NOTA) > 8;