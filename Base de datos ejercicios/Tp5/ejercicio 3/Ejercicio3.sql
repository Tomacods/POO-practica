-- crear tablas
create table alumno (
    legajo int primary key,
    nombre varchar(50),
    dirección varchar(100),
    edad int,
    condición varchar(10)
);

create table materia (
    código int primary key,
    nombre varchar(50),
    carrera varchar(50),
    facultad varchar(50),
    duración varchar(15)
);

create table examen (
    legajo int,
    código int,
    fecha date,
    nota decimal(3, 2),
    primary key (legajo, código, fecha),
    foreign key (legajo) references alumno(legajo),
    foreign key (código) references materia(código)
);

-- insertar datos de ejemplo
insert into alumno (legajo, nombre, dirección, edad, condición) values
(1, 'juan perez', 'calle falsa 123', 20, 'regular'),
(2, 'ana gomez', 'avenida siempre viva 456', 22, 'libre');

insert into materia (código, nombre, carrera, facultad, duración) values
(101, 'estadística', 'licenciatura en informática', 'facultad de ingeniería', 'anual'),
(102, 'álgebra', 'licenciatura en matemáticas', 'facultad de ingeniería', 'cuatrimestral');

insert into examen (legajo, código, fecha, nota) values
(1, 101, '2023-06-15', 9.0),
(2, 101, '2023-06-15', 7.5);

-- a. listar los legajos, el nombre y apellido de los alumnos que cursan la materia “estadística” en la carrera “licenciatura en informática” de la facultad de ingeniería, ordenado por legajo.
select alumno.legajo, alumno.nombre
from alumno
join examen on alumno.legajo = examen.legajo
join materia on examen.código = materia.código
where materia.nombre = 'estadística'
  and materia.carrera = 'licenciatura en informática'
  and materia.facultad = 'facultad de ingeniería'
order by alumno.legajo;

-- b. listar la cantidad de materias por carrera, para la facultad de ingeniería, ordenada por código de la carrera.
select carrera, count(*) as cantidad_materias
from materia
where facultad = 'facultad de ingeniería'
group by carrera
order by carrera;

-- c. listar la nota promedio por alumno, para aquellos promedios superiores a 8 (ocho).
select alumno.legajo, alumno.nombre, avg(examen.nota) as promedio
from alumno
join examen on alumno.legajo = examen.legajo
group by alumno.legajo, alumno.nombre
having avg(examen.nota) > 8;