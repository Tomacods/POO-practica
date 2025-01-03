--tablas
create table dias_semana (
    codigo_dia_semana int primary key,
    dia_semana varchar(50)
);
create table especialidades (
    codigo_especialidad int primary key,
    descripcion_especialidad varchar(100)
);
create table generos_sexuales (
    genero_sexual int primary key,
    descripcion_genero varchar(50)
);
create table horarios (
    dni_profesional int,
    codigo_especialidad int,
    codigo_dia_semana int,
    hora_desde time,
    duracion int,
    primary key (dni_profesional, codigo_especialidad, codigo_dia_semana, hora_desde),
    foreign key (codigo_dia_semana) references dias_semana(codigo_dia_semana),
    foreign key (dni_profesional, codigo_especialidad) references profesionales(dni_profesional, codigo_especialidad)
);
create table personas (
    dni_persona int primary key,
    nombre_persona varchar(50),
    apellido_persona varchar(50),
    genero_persona int,
    fecha_nacimiento date,
    telefono_contacto varchar(20),
    foreign key (genero_persona) references generos_sexuales(genero_sexual)
);
create table profesionales (
    dni_profesional int primary key,
    nombre_profesional varchar(50),
    apellido_profesional varchar(50),
    telefonos varchar(20),
    genero_profesional int,
    foreign key (genero_profesional) references generos_sexuales(genero_sexual)
);
create table profesionales_especialidades (
    dni_profesional int,
    codigo_especialidad int,
    fecha_obtencion_titulo date,
    primary key (dni_profesional, codigo_especialidad),
    foreign key (codigo_especialidad) references especialidades(codigo_especialidad),
    foreign key (dni_profesional) references profesionales(dni_profesional)
);
create table profesionales_especialidades_dias_semanales (
    dni_profesional int,
    codigo_especialidad int,
    codigo_dia_semana int,
    primary key (dni_profesional, codigo_especialidad, codigo_dia_semana),
    foreign key (dni_profesional, codigo_especialidad) references profesionales_especialidades(dni_profesional, codigo_especialidad),
    foreign key (codigo_dia_semana) references dias_semana(codigo_dia_semana)
);
create table turnos (
    numero_turno int primary key,
    fecha_turno date,
    dni_persona int,
    dni_profesional int,
    codigo_especialidad int,
    codigo_dia_semana int,
    hora_desde time,
    foreign key (dni_profesional, codigo_especialidad, codigo_dia_semana, hora_desde) references horarios(dni_profesional, codigo_especialidad, codigo_dia_semana, hora_desde),
    foreign key (dni_persona) references persona(dni_persona)
);
-- muestra los turnos de la paciente Lara Lynch
SELECT p.dni_persona, p.nombre_persona||','||  p.apellido_persona as paciente, pr.apellido_profesional, pr.genero_profesional, t.numero_turno
FROM personas p
JOIN turnos t ON p.dni_persona = t.dni_persona
JOIN profesionales pr ON t.dni_profesional = pr.dni_profesional
WHERE P.apellido_persona = 'Lynch'
AND p.nombre_persona = 'Lara'
AND pr.genero_profesional = 'Femenino';

--mostrar a todos los profecionales que hayan obtenido el título de una
-- especialidad en 1987, indicando cual es la especialidad en la cual
--obtuvo el título

SELECT pe.dni_profesional, pe.codigo_especialidad, pe.fecha_obtencion_titulo, e.descripcion_especialidad
FROM profesionales_especialidades pe
JOIN especialidades e ON pe.codigo_especialidad = e.codigo_especialidad
WHERE extract (year from pe.fecha_obtencion_titulo) = '1987';

-- Los profesionales que atienden los fines de semana

SELECT p.nombre_profesional, case
when h.codigo_dia_semana = 0 then 'Domingo'
when h.codigo_dia_semana = 6 then 'Sabado'
end
from profesionales p
join horarios h on p.dni_profesional = h.dni_profesional
where h.codigo_dia_semana = 0 or h.codigo_dia_semana = 6;

--Mostrar los horarios con sus especialidades del prestador cuyo apellido es “Berger”

select p.nombre_profesional, e.descripcion_especialidad, extract (HOUR from h.hora_desde) hora, case
when h.codigo_dia_semana = 0 then 'Domingo'
when h.codigo_dia_semana = 1 then 'Lunes'
when h.codigo_dia_semana = 2 then 'Martes'
when h.codigo_dia_semana = 3 then 'Miercoles'
when h.codigo_dia_semana = 4 then 'Jueves'
when h.codigo_dia_semana = 5 then 'Viernes'
when h.codigo_dia_semana = 6 then 'Sabado'
end as dia
from profesionales p
join horarios h on p.dni_profesional = h.dni_profesional
join especialidades e on h.codigo_especialidad = e.codigo_especialidad
where p.apellido_profesional = 'Berger';

--Mostrar los turnos femeninos de Odontología (paciente y profesional).

select * from turnos t
join profecionales p on t.dni_profesional = p.dni_profesional
join personas pe on t.dni_persona = pe.dni_persona
where p.genero_profesional = 'Femenino' and pe.genero_persona = 'Femenino' and t.codigo_especialidad = 1;

-- Listar los profesionales y las personas que poseen el mismo género.
select p.genero_profesional, pe.genero_persona
from profesionales p
join personas pe on p.genero_profesional = pe.genero_persona
where p.genero_profesional = pe.genero_persona;
--Listar todos los turnos del 2005 en que el profesional es Femenino y que la persona posee género Masculino.
select * from turnos t
join profesionales p on t.dni_profesional = p.dni_profesional
join personas pe on t.dni_persona = pe.dni_persona
where extract (year from t.fecha_turno) = 2005 and p.genero_profesional = 'Femenino' and pe.genero_persona = 'Masculino';

--Listar las personas que tengan turno el mismo año en que nacieron
select * from personas p
join turnos t on p.dni_persona = t.dni_persona
where extract (year from p.fecha_nacimiento) = extract (year from t.fecha_turno);

-- --ejemplo para crear una tabla Historico_persona en microsoft sql server como store procedure
-- CREATE PROCEDURE CrearTablaHistoricoPersona
-- AS
-- BEGIN
--     CREATE TABLE Historico_persona (
--         dni_persona int primary key,
--         nombre_persona varchar(50),
--         apellido_persona varchar(50),
--         genero_persona int,
--         fecha_nacimiento date,
--         telefono_contacto varchar(20),
--         fecha_modificacion datetime
--     );
-- END;

--iInvestigar sobre Triggers en SQL Server, y presentar la estructura de declaración de un Trigger.
--Un trigger es un objeto de base de datos que se activa en respuesta a un evento particular en una base de datos o servidor de bases de datos.
--Los eventos que pueden activar un trigger son los siguientes:
--INSERT: Se activa después de insertar un registro.
--UPDATE: Se activa después de actualizar un registro.
--DELETE: Se activa después de eliminar un registro.
--CREATE: Se activa después de crear un objeto.

--Estructura de un trigger
    -- CREATE TRIGGER nombre_trigger
    -- ON nombre_tabla
    -- AFTER INSERT, UPDATE, DELETE
    -- AS
    -- BEGIN
    --     --cuerpo del trigger
    -- END;

--Crear un trigger que al modificar algún dato del cliente genere el histórico del cambio realizado.

-- CREATE TRIGGER trigger_historico_persona
-- ON personas
-- AFTER UPDATE
-- AS
-- BEGIN
--     INSERT INTO Historico_persona
--     SELECT dni_persona, nombre_persona, apellido_persona, genero_persona, fecha_nacimiento, telefono_contacto, getdate()
--     FROM deleted;
-- END;

-- CREATE TRIGGER TRG_CLIENTE_MOD ON personas AFTER 
-- UPDATE AS 
-- BEGIN
--  INSERT INTO HISTORICO_CLIENTE
--  (ID_CLIENTE,  FECHA_MODIFICACION)
--  SELECT ID_CLIENTE, GETDATE()
--  FROM INSERTED  
--  END

--13 Investigar sobre la declaración y uso de Cursores, presentando la declaración genérica de un Cursor.
--Un cursor es un objeto que permite recorrer los registros de un conjunto de resultados.
--Los cursores se utilizan para recorrer los registros de una tabla de forma secuencial.
--Los cursores se utilizan para realizar operaciones en un conjunto de registros fila por fila.
--Los cursores se utilizan para recuperar registros de una tabla de forma secuencial.

--Declaración de un cursor
-- DECLARE nombre_cursor CURSOR FOR
-- SELECT columna1, columna2, columna3
-- FROM nombre_tabla
-- WHERE condicion;

--Listar las personas que se atendieron los días miércoles y viernes, con profesionales femeninos, y especializados en alergias.
    select pe.nombre_persona, pe.apellido_persona, pr.nombre_profesional, pr.apellido_profesional, e.descripcion_especialidad
    from personas pe
    join turnos t on pe.dni_persona = t.dni_persona
    join profesionales pr on t.dni_profesional = pr.dni_profesional
    join horarios h on t.dni_profesional = h.dni_profesional
    join especialidades e on t.codigo_especialidad = e.codigo_especialidad
    where h.codigo_dia_semana = 3 or h.codigo_dia_semana = 5 and pr.genero_profesional = 'Femenino' and e.descripcion_especialidad = 'Alerlogia';

--Armar una vista que muestre la información (DNI, NOMBRE_PROFESIONAL,FECHA_TURNO, ESPECIALIDAD, PERSONA) Ordenada por fecha del turno, y persona.


    SELECT t.dni_profesional, pr.nombre_profesional, t.fecha_turno, e.descripcion_especialidad, pe.nombre_persona||','||pe.apellido_persona as persona
    FROM turnos t
    JOIN profesionales pr ON t.dni_profesional = pr.dni_profesional
    JOIN especialidades e ON t.codigo_especialidad = e.codigo_especialidad
    JOIN personas pe ON t.dni_persona = pe.dni_persona
    ORDER BY t.fecha_turno, pe.nombre_persona;

--Listar los horarios libres de los profesionales en el mes de junio de 2012.
    SELECT p.nombre_profesional, e.descripcion_especialidad, d.dia_semana, h.hora_desde
    FROM profesionales p
    JOIN horarios h ON p.dni_profesional = h.dni_profesional
    JOIN especialidades e ON h.codigo_especialidad = e.codigo_especialidad
    JOIN dias_semana d ON h.codigo_dia_semana = d.codigo_dia_semana
    WHERE h.hora_desde NOT IN (
        SELECT t.hora_desde
        FROM turnos t
        WHERE extract (month from t.fecha_turno) = 6
        AND extract (year from t.fecha_turno) = 2012
    );

     --Listar las personas que se atendieron los días viernes y sábados, con profesionales especializados en Nefrologia.
    SELECT pe.nombre_persona, pe.apellido_persona, pr.nombre_profesional, pr.apellido_profesional, e.descripcion_especialidad
    FROM personas pe
    JOIN turnos t ON pe.dni_persona = t.dni_persona
    JOIN profesionales_especialidades pr ON t.dni_profesional = pr.dni_profesional
    JOIN especialidades e ON t.codigo_especialidad = e.codigo_especialidad
    JOIN horarios h ON t.dni_profesional = h.dni_profesional
    WHERE h.codigo_dia_semana = 5 and h.codigo_dia_semana = 6 AND e.descripcion_especialidad = 'Nefrologia';

    -- Listar la cantidad de pacientes atendidos por profesional, especialidad, y por mes (AAAAMM).
    SELECT pr.nombre_profesional, e.descripcion_especialidad,extract (year from t.fecha_turno)  || '-' || extract (month from t.fecha_turno) as AAAAMM, count(t.dni_persona) as cantidad_pacientes
    FROM turnos t
    JOIN profesionales pr ON t.dni_profesional = pr.dni_profesional
    JOIN especialidades e ON t.codigo_especialidad = e.codigo_especialidad
    join profesionales_especialidades pro on t.dni_profesional = pro.dni_profesional
    GROUP BY pr.nombre_profesional, e.descripcion_especialidad, extract (month from t.fecha_turno),extract (year from t.fecha_turno);


--Armar una vista que muestre la información (GENERO_SEXUAL, ESPECIALIDAD, PROMEDIO_TURNOS) Ordenada por especialidad, y promedio
    create view vista_promedio_turnos as
    SELECT g.descripcion_genero, e.descripcion_especialidad, avg(t.numero_turno) as promedio_turnos
    FROM turnos t
    JOIN profesionales pr ON t.dni_profesional = pr.dni_profesional
    JOIN generos_sexuales g ON pr.genero_profesional = g.genero_sexual
    JOIN especialidades e ON t.codigo_especialidad = e.codigo_especialidad
    GROUP BY g.descripcion_genero, e.descripcion_especialidad
    ORDER BY e.descripcion_especialidad, avg(t.numero_turno);

    -- Armar una función que basándose en el parámetro de entrada @dni_profesional, @codigo_especialidad, devuelva la cantidad de turnos del profesional.

    CREATE FUNCTION cantidad_turnos_profesional (@dni_profesional int, @codigo_especialidad int)
    RETURNS int
    AS
    BEGIN
        DECLARE @cantidad_turnos int;
        SELECT @cantidad_turnos = count(*)
        FROM turnos
        WHERE dni_profesional = @dni_profesional
        AND codigo_especialidad = @codigo_especialidad;
        RETURN @cantidad_turnos;
    END;

--     Crear un stored procedure que liste para un determinado período (@fecha_desde, @fecha_hasta) la relación de cantidad de turnos del profesional (@dni_profesional) por
-- especialidad en dicho periodo, con respecto al total de turnos de ese profesional y su
-- respectiva especialidad. Formato de salida (Profesional, Especialidad, Cantidad Turnos
-- En Periodo, Cantidad Turnos Total, Porcentaje) Porcentaje = (Cantidad Turnos En
-- Periodo / Cantidad Turnos Total) * 100

CREATE PROCEDURE cantidad_turnos_profesional_periodo (@dni_profesional int, @fecha_desde date, @fecha_hasta date)
AS
BEGIN
    DECLARE @cantidad_total int;
    DECLARE @cantidad_periodo int;
    SELECT @cantidad_total = count(*)
    FROM turnos
    WHERE dni_profesional = @dni_profesional;

    SELECT @cantidad_periodo = count(*)
    FROM turnos
    WHERE dni_profesional = @dni_profesional
    AND fecha_turno BETWEEN @fecha_desde AND @fecha_hasta;

    SELECT pr.nombre_profesional, e.descripcion_especialidad, @cantidad_periodo as cantidad_turnos_en_periodo, @cantidad_total as cantidad_turnos_total, ((@cantidad_periodo / @cantidad_total) * 100) as porcentaje
    FROM profesionales pr
    JOIN profesionales_especialidades pe ON pr.dni_profesional = pe.dni_profesional
    JOIN especialidades e ON pe.codigo_especialidad = e.codigo_especialidad
    WHERE pr.dni_profesional = @dni_profesional;
END;

--     Crear un stored procedure que liste para un determinado período (@fecha_desde, @fecha_hasta) la relación de cantidad de turnos del profesional (@dni_profesional) por
-- especialidad en dicho periodo, con respecto al total de turnos de ese profesional y su
-- respectiva especialidad. Formato de salida (Profesional, Especialidad, Cantidad Turnos
-- En Periodo, Cantidad Turnos Total, Porcentaje) Porcentaje = (Cantidad Turnos En
-- Periodo / Cantidad Turnos Total) * 100

create PROCEDURE sp_Dasilva_tomas_ej5e_porcentaje
(@fecha_desde DATE, @fecha_hasta DATE, @dni int)
AS
BEGIN
SET NOCOUNT ON;

SELECT  p.dni_profesional, p.apellido_profesional,

( SELECT COUNT(*)  FROM turnos t 
WHERE t.dni_profesional = @dni 
AND CAST(t.fecha_turno AS DATE) BETWEEN @fecha_desde AND @fecha_hasta ) AS cantidad_periodo,

(SELECT COUNT(*)  FROM turnos t  WHERE t.dni_profesional = @dni) AS cantidad_profesional,

CASE  when ( SELECT COUNT(*)  FROM turnos t 
WHERE t.dni_profesional = @dni) > 0 
THEN (
(SELECT COUNT(*) FROM turnos t 
WHERE t.dni_profesional = @dni AND CAST(t.fecha_turno AS DATE) BETWEEN @fecha_desde AND @fecha_hasta ) * 100.0 
/ (SELECT COUNT(*)  FROM turnos t  WHERE t.dni_profesional = @dni)) ELSE 0 END AS porcentaje
FROM 
profesionales p where p.dni_profesional = @dni
END
-- Listar los horarios disponibles para la especialidad “Medicina de urgencias” de los profesionales femeninos.
SELECT p.nombre_profesional, e.descripcion_especialidad, d.dia_semana, h.hora_desde
FROM profesionales p
JOIN horarios h ON p.dni_profesional = h.dni_profesional
JOIN especialidades e ON h.codigo_especialidad = e.codigo_especialidad
JOIN dias_semana d ON h.codigo_dia_semana = d.codigo_dia_semana
WHERE e.descripcion_especialidad = 'Medicina de urgencias' AND p.genero_profesional = 'Femenino';

--
-- Los nombres de todos los profesionales masculinos y horarios para “Medicina del deporte”
SELECT p.nombre_profesional, h.hora_desde
FROM profesionales p
JOIN horarios h ON p.dni_profesional = h.dni_profesional
JOIN especialidades e ON h.codigo_especialidad = e.codigo_especialidad
WHERE e.descripcion_especialidad = 'Medicina del deporte' AND p.genero_profesional = 'Masculino';

-- Mostrar los horarios con sus especialidades del profesional cuyo apellido es “Berger”
-- Listar las personas que tengan turno el mismo año en que nacieron.


create view personas_no_atendidas as 
select 
    pe.dni_persona, pe.nombre_persona -- seleciono los campos que quiero mostrar
from 
    personas pe
where pe.dni_persona not in ( --las personas que no estan en la tabla de turnos
        select t.dni_persona --hago un select de la tabla de turnos
        from turnos t); --la tabla de turnos

--listar los dni de los pacientes que tienen turnos
select dni_persona from turnos;



CREATE FUNCTION ObtenerEdad ( @dni INT)
RETURNS INT
AS
BEGIN
    DECLARE @edad INT; -- variable para guardar la edad

    SELECT 
        @edad = DATEDIFF(YEAR, fecha_nacimiento, GETDATE()) -
                CASE 
                    WHEN MONTH(fecha_nacimiento) > MONTH(GETDATE()) OR (MONTH(fecha_nacimiento) = MONTH(GETDATE()) AND DAY(fecha_nacimiento) > DAY(GETDATE())) --si el mes de nacimiento es mayor al mes actual o si el mes de nacimiento es igual al mes actual y el dia de nacimiento es mayor al dia actual
                    THEN 1 --resto 1 a la edad
                    ELSE 0 --sino no resto nada
                END
    FROM 
        personas --de la tabla personas
    WHERE 
        dni_persona = @dni;

    RETURN @edad;
END;

--consultas en cypher

MATCH (p:profesionales)-[:TIENE_GENERO]->(g:generos_sexuales)
RETURN p
LIMIT 20

-- muestra los turnos de la paciente Lara Lynch
