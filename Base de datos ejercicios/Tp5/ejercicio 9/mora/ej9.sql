--Listar los datos de los turnos de las personas masculinas que se
--atendieron para las especialidades de “Proctología” y “Urología”
SELECT t.numero_turno,p.genero_persona,e.descripcion_especialidad
FROM turnos t INNER JOIN  especialidades e 
                ON t.codigo_especialidad=e.codigo_especialidad
 INNER JOIN personas p 
                ON t.dni_persona=p.dni_persona
WHERE (e.descripcion_especialidad ='Proctologia' OR e.descripcion_especialidad='Urologia') AND p.genero_persona='Masculino'

--Listar la cantidad de turnos realizados por especialidad y por género 
-- sexual de paciente, en el año 2015 
SELECT e.descripcion_especialidad, p.genero_persona, COUNT(t.numero_turno) cantidad_turnos--, EXTRACT('year' FROM t.fecha_turno) 
FROM turnos t
JOIN  personas p ON t.dni_persona = p.dni_persona
JOIN especialidades e ON t.codigo_especialidad = e.codigo_especialidad
WHERE EXTRACT('year' FROM t.fecha_turno) = 2014
GROUP BY e.descripcion_especialidad, p.genero_persona--, t.fecha_turno;

-- Armar una vista que muestre la información (DNI,NOMBRE_PROFESIONAL,FECHA_TURNO, PERSONA_ATENDIDA,DIA_SEMANA) 
--Ordenada por fecha del turno y por persona. 

--SELECT p.dni_profesional,  apellido_profesional || ','||  nombre_profesional as nombre_completo, t.fecha_turno, 
--pe.apellido_persona||','|| pe.nombre_persona as nombre_paciente, EXTRACT(dow from t.fecha_turno) as dia_semana
--FROM profesionales p
--INNER JOIN turnos t ON p.dni_profesional = t.dni_profesional
--INNER JOIN personas pe ON t.dni_persona = pe.dni_persona
--ORDER BY t.fecha_turno, nombre_paciente

--SELECT p.dni_profesional,  apellido_profesional || ','||  nombre_profesional as nombre_completo, t.fecha_turno, 
--pe.apellido_persona||','|| pe.nombre_persona as nombre_paciente, t.codigo_dia_semana
--FROM profesionales p
--INNER JOIN turnos t ON p.dni_profesional = t.dni_profesional
--INNER JOIN personas pe ON t.dni_persona = pe.dni_persona
--ORDER BY t.fecha_turno,  -- ACA LO HAGO CON CODIGO DIA DE SEMANA PERO ESTA MAL

--para armar la vista vas a view apretas crear, le pones un nombre, en code copias la query de arriba y solo la llamas como abajo
SELECT * FROM vw_info_turno


-- Listar los profesionales que se atienden los días martes y jueves, cuya 
--especialidad esté entre las siguientes ('Medicina aeroespacial', 
--"Medicina del deporte", "Medicina del trabajo", "Medicina de urgencias", 
--"Medicina fam. y comunitaria", "Medicina intensiva", "Medicina interna", 
--"Medicina legal y forense", "Medicina prev. y salud pub"). 
SELECT * 
FROM profesionales pr INNER JOIN turnos t ON pr.dni_profesional = t.dni_profesional 
INNER JOIN especialidades e ON t.codigo_especialidad = e.codigo_especialidad
WHERE e.descripcion_especialidad IN ('Medicina aeroespacial', 
'Medicina del deporte', 'Medicina del trabajo', 'Medicina de urgencias', 
'Medicina fam. y comunitaria', 'Medicina intensiva', 'Medicina interna', 
'Medicina legal y forense', 'Medicina prev. y salud pub') AND t.codigo_dia_semana IN (2,4);

--Listar la cantidad de turnos efectuados por profesionales femeninos a 
--personas de sexo femenino.

SELECT pr.genero_profesional, pe.genero_persona, COUNT (t.numero_turno) cantidad_turnos
FROM profesionales pr INNER JOIN turnos t ON pr.dni_profesional = t.dni_profesional
INNER JOIN personas pe ON t.dni_persona = pe.dni_persona
WHERE pr.genero_profesional = 'Femenino' AND pe.genero_persona = 'Femenino'
GROUP BY pr.genero_profesional, pe.genero_persona


--Armar una vista que muestre el ranking de mayor cantidad de turnos por 
--especialidad con la siguiente información 
--(ESPECIALIDAD,CANTIDAD_TURNOS) 

--SELECT e.descripcion_especialidad, COUNT (t.numero_turno) cantidad_turnos
--FROM especialidades e INNER JOIN turnos t ON e.codigo_especialidad = t.codigo_especialidad
--GROUP BY e.descripcion_especialidad
--ORDER BY cantidad_turnos DESC

SELECT * FROM vw_ranking_turnos_especialidades















