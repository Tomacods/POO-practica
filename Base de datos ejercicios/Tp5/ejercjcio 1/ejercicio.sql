-- Crear el esquema de tablas
CREATE TABLE CLIENTE (
    ID_CLIENTE SERIAL PRIMARY KEY,
    NOMBRE_CLIENTE VARCHAR(100),
    RENTA_ANUAL DECIMAL,
    TIPO_CLIENTE VARCHAR(50)
);

CREATE TABLE CAMION (
    ID_CAMION SERIAL PRIMARY KEY,
    NOMBRE_CHOFER VARCHAR(100)
);

CREATE TABLE EMBARQUE (
    NUM_EMBARQUE SERIAL PRIMARY KEY,
    ID_CLIENTE INT REFERENCES CLIENTE(ID_CLIENTE),
    PESO DECIMAL,
    ID_CAMION INT REFERENCES CAMION(ID_CAMION),
    DESTINO VARCHAR(100),
    FECHA DATE
);

CREATE TABLE CIUDAD (
    NOMBRE_CIUDAD VARCHAR(100) PRIMARY KEY,
    POBLACION INT
);

-- Consultas SQL

-- a. Los nombres de todos los clientes que sean minoristas.
SELECT NOMBRE_CLIENTE
FROM CLIENTE
WHERE TIPO_CLIENTE = 'minorista';

-- b. ¿Cuáles son los números de los camiones que han llevado paquetes (embarques) por encima de 100 kg?
SELECT DISTINCT ID_CAMION
FROM EMBARQUE
WHERE PESO > 100;

-- c. Dé todos los datos de los embarques de más de 20 kg
SELECT *
FROM EMBARQUE
WHERE PESO > 20;

-- d. Cree una lista por orden alfabético de los clientes con renta anual de más de 10 millones
SELECT NOMBRE_CLIENTE
FROM CLIENTE
WHERE RENTA_ANUAL > 10000000
ORDER BY NOMBRE_CLIENTE;

-- e. ¿Cómo se llaman los clientes que han enviado paquetes a Bariloche?
SELECT DISTINCT C.NOMBRE_CLIENTE
FROM CLIENTE C
JOIN EMBARQUE E ON C.ID_CLIENTE = E.ID_CLIENTE
WHERE E.DESTINO = 'Bariloche';

-- f. ¿A cuáles destinos han hecho envíos las compañías con renta anual menor que 1 millón?
SELECT DISTINCT E.DESTINO
FROM EMBARQUE E
JOIN CLIENTE C ON E.ID_CLIENTE = C.ID_CLIENTE
WHERE C.RENTA_ANUAL < 1000000;

-- g. ¿Cuáles son los nombres y las poblaciones de las ciudades que han recibido embarques que pesen más de 100 kg?
SELECT DISTINCT CI.NOMBRE_CIUDAD, CI.POBLACION
FROM CIUDAD CI
JOIN EMBARQUE E ON CI.NOMBRE_CIUDAD = E.DESTINO
WHERE E.PESO > 100;

-- h. Indique los choferes que han transportado embarques a cada una de las ciudades.
SELECT DISTINCT CI.NOMBRE_CIUDAD, CA.NOMBRE_CHOFER
FROM CIUDAD CI
JOIN EMBARQUE E ON CI.NOMBRE_CIUDAD = E.DESTINO
JOIN CAMION CA ON E.ID_CAMION = CA.ID_CAMION;

-- i. Indique el nombre y la renta anual de los clientes que han enviado embarques que pesan más de 100 kg.
SELECT DISTINCT C.NOMBRE_CLIENTE, C.RENTA_ANUAL
FROM CLIENTE C
JOIN EMBARQUE E ON C.ID_CLIENTE = E.ID_CLIENTE
WHERE E.PESO > 100;

-- j. ¿Cuál es el peso promedio de los embarques?
SELECT AVG(PESO) AS PESO_PROMEDIO
FROM EMBARQUE;

-- k. ¿Cuál es el peso promedio de los embarques que van a Neuquén?
SELECT AVG(PESO) AS PESO_PROMEDIO_NEUQUEN
FROM EMBARQUE
WHERE DESTINO = 'Neuquén';

-- l. ¿Cuántos embarques han sido enviados por el cliente 433?
SELECT COUNT(*) AS TOTAL_EMBARQUES
FROM EMBARQUE
WHERE ID_CLIENTE = 433;

-- m. Para cada cliente ¿cuál es el peso medio de los paquetes enviados por él?
SELECT ID_CLIENTE, AVG(PESO) AS PESO_MEDIO
FROM EMBARQUE
GROUP BY ID_CLIENTE;


SELECT CH.CHOFER, COUNT(*) AS CANTIDAD_EMBARQUES
FROM (SELECT CHOFER, DESTINO
        FROM EMBARQUE INNER JOIN  VEICULO ON EMBARQUE.ID_CAMION = VEICULO.ID_CAMION
        GROUP BY CHOFER, DESTINO) AS CC
        GROUP BY CC.CHOFER
        HAVING COUNT(*) = (SELECT COUNT(*) FROM CIUDAD);

--ejemplos para insertar datos a las tablas 10 decada 1
