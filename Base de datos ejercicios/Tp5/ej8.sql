

select * from especialidades
 --a)  Los nombres de todos los profesionales masculinos y horarios para 
-- “Medicina del deporte”.
SELECT DISTINCT p.nombre_profesional, EXTRACT(HOUR FROM h.hora_desde) horario, e.descripcion_especialidad especialidad
from profesionales p
INNER JOIN turnos t ON p.dni_profesional = t.dni_profesional
INNER JOIN horarios h on t.hora_desde = h.hora_desde 
INNER JOIN especialidades e on t.codigo_especialidad = e.codigo_especialidad
where p.genero_profesional = 'Masculino' and e.descripcion_especialidad='Medicina del deporte'
--b)  Mostrar el detalle de los turnos de “Marcus Ortiz” en los cuales haya 
 --sido atendido por un profesional femenino. //Lara Lynch
 SELECT distinct per.dni_persona, per.nombre_persona || ','|| per.apellido_persona as paciente, pro.genero_profesional, pro.apellido_profesional,
  t.numero_turno
 from personas per
 inner join turnos t on per.dni_persona = t.dni_persona 
 inner join profesionales pro on t.dni_profesional = pro.dni_profesional
 where per.apellido_persona = 'Lynch' and per.nombre_persona = 'Lara' and pro.genero_profesional = 'Femenino'

 

select nombre_persona, apellido_persona from personas where dni_persona = 77161094 order by apellido_persona
select *  from turnos t inner join profesionales p on t.dni_profesional = p.dni_profesional where p.genero_profesional = 'Femenino'
 
-- c)  Mostrar a todos los profesionales que hayan obtenido el título de una 
-- especialidad en 1987, indicando cual es la especialidad en la cual 
 --obtuvo el título. 
 SELECT pro.dni_profesional, pro.nombre_profesional, pe.fecha_obtencion_titulo, e.descripcion_especialidad
 from profesionales pro inner join profesionales_especialidades pe on pro.dni_profesional =pe.dni_profesional
 inner join especialidades e on pe.codigo_especialidad = e.codigo_especialidad
 where  extract (year from pe.fecha_obtencion_titulo) = 1987 
 
 select * from  profesionales_especialidades
 --d)  Los profesionales que atienden los fines de semana.
 SELECT distinct pro.nombre_profesional, 
 case 
 when h.codigo_dia_semana  = 0 then 'Domingo' 
 when h.codigo_dia_semana = 6 then 'Sabado' 
 end
 from profesionales pro
 inner join horarios h on pro.dni_profesional = h.dni_profesional 
 where h.codigo_dia_semana = 0 or h.codigo_dia_semana = 6
 -- e)  Mostrar los horarios con sus especialidades del prestador cuyo apellido 
-- es “Berger”
 select pro.apellido_profesional, e.descripcion_especialidad,  EXTRACT(HOUR FROM h.hora_desde) hora, CASE 
WHEN h.codigo_dia_semana = 0 THEN 'Domingo'
WHEN h.codigo_dia_semana = 1 THEN 'Lunes'
WHEN h.codigo_dia_semana = 2 THEN 'Martes'
WHEN h.codigo_dia_semana = 3 THEN 'Miercoles'
WHEN h.codigo_dia_semana = 4 THEN 'Jueves'
WHEN h.codigo_dia_semana = 5 THEN 'Viernes'
WHEN h.codigo_dia_semana = 6 THEN 'Sabado'
END as Dia
from profesionales pro inner join horarios h on h.dni_profesional = pro.dni_profesional
inner join especialidades e on h.codigo_especialidad = e.codigo_especialidad 
where pro.apellido_profesional = 'Berger'

-- f)  Mostrar los turnos femeninos de Odontología (paciente y profesional). 
SELECT * from turnos 
inner join profesionales p on turnos.dni_profesional = p.dni_profesional
inner join personas pe on turnos.dni_persona = pe.dni_persona
where p.genero_profesional = 'Femenino' and pe.genero_persona = 'Femenino'

-- g)  Listar los profesionales y las personas que poseen el mismo género. 
select pro.genero_profesional, pe.genero_persona
from  profesionales pro, personas pe
where pe.genero_persona   =  pro.genero_profesional

-- h)  Listar todos los turnos del 2005 en que el profesional es Femenino y 
-- que la persona posee género Masculino. 

select *  from turnos t 
 join profesionales pro on t.dni_profesional = pro.dni_profesional
 join personas p on t.dni_persona = p.dni_persona 
where extract(year from t.fecha_turno) = 2005 and pro.genero_profesional= 'Femenino' and p.genero_persona = 'Masculino'


-- i)  Listar las personas que tengan turno el mismo año en que nacieron
Select * from personas
inner join turnos t on personas.dni_persona = t.dni_persona
where extract(year from t.fecha_turno) = extract(year from personas.fecha_nacimiento)

