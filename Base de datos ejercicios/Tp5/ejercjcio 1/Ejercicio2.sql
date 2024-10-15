-- Crear tablas
CREATE TABLE DOCENTE (
    DNI INT PRIMARY KEY,
    APELLIDO VARCHAR(50),
    NOMBRE VARCHAR(50),
    DOMICILIO VARCHAR(100),
    TITULO VARCHAR(50)
);

CREATE TABLE DOCMAT (
    DNI INT,
    COD_MAT INT,
    CARGO VARCHAR(50),
    SALARIO DECIMAL(10, 2),
    DEPARTAMENTO VARCHAR(50),
    PRIMARY KEY (DNI, COD_MAT),
    FOREIGN KEY (DNI) REFERENCES DOCENTE(DNI)
);

CREATE TABLE MATERIA (
    COD_MAT INT PRIMARY KEY,
    NOMBRE VARCHAR(50),
    CARGA_HORARIA INT
);

-- Insertar datos de ejemplo
INSERT INTO DOCENTE (DNI, APELLIDO, NOMBRE, DOMICILIO, TITULO) VALUES
(12345678, 'Perez', 'Juan', 'Calle Falsa 123', 'Analista de Sistemas'),
(87654321, 'Gomez', 'Ana', 'Avenida Siempre Viva 456', 'Licenciado en Matemáticas');

INSERT INTO DOCMAT (DNI, COD_MAT, CARGO, SALARIO, DEPARTAMENTO) VALUES
(12345678, 1, 'Titular', 15000, 'Matemáticas'),
(87654321, 2, 'Adjunto', 13000, 'Matemáticas');

INSERT INTO MATERIA (COD_MAT, NOMBRE, CARGA_HORARIA) VALUES
(1, 'Álgebra', 5),
(2, 'Cálculo', 4);

-- a. Listar los nombres y el título de los docentes que trabajan en el departamento de matemáticas.
SELECT DOCENTE.NOMBRE, DOCENTE.TITULO
FROM DOCENTE
JOIN DOCMAT ON DOCENTE.DNI = DOCMAT.DNI
WHERE DOCMAT.DEPARTAMENTO = 'Matemáticas';

-- b. Listar los departamentos en los que se abona más de $12000 en sueldos docentes.
SELECT DISTINCT DEPARTAMENTO
FROM DOCMAT
WHERE SALARIO > 12000;

-- c. Listar los nombres y carga horaria de las materias y los nombres y apellidos de los docentes cuyo título es Analista de Sistemas.
SELECT MATERIA.NOMBRE AS Materia, MATERIA.CARGA_HORARIA, DOCENTE.NOMBRE, DOCENTE.APELLIDO
FROM MATERIA
JOIN DOCMAT ON MATERIA.COD_MAT = DOCMAT.COD_MAT
JOIN DOCENTE ON DOCMAT.DNI = DOCENTE.DNI
WHERE DOCENTE.TITULO = 'Analista de Sistemas';