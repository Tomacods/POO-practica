-- crear tablas
create table docente (
    dni int primary key,
    apellido varchar(50),
    nombre varchar(50),
    domicilio varchar(100),
    titulo varchar(50)
);

create table docmat (
    dni int,
    cod_mat int,
    cargo varchar(50),
    salario decimal(10, 2),
    departamento varchar(50),
    primary key (dni, cod_mat),
    foreign key (dni) references docente(dni)
);

create table materia (
    cod_mat int primary key,
    nombre varchar(50),
    carga_horaria int
);

-- insertar datos de ejemplo
insert into docente (dni, apellido, nombre, domicilio, titulo) values
(12345678, 'perez', 'juan', 'calle falsa 123', 'analista de sistemas'),
(87654321, 'gomez', 'ana', 'avenida siempre viva 456', 'licenciado en matemáticas');

insert into docmat (dni, cod_mat, cargo, salario, departamento) values
(12345678, 1, 'titular', 15000, 'matemáticas'),
(87654321, 2, 'adjunto', 13000, 'matemáticas');

insert into materia (cod_mat, nombre, carga_horaria) values
(1, 'álgebra', 5),
(2, 'cálculo', 4);

-- a. listar los nombres y el título de los docentes que trabajan en el departamento de matemáticas.
select docente.nombre, docente.titulo
from docente
join docmat on docente.dni = docmat.dni
where docmat.departamento = 'matemáticas';

-- b. listar los departamentos en los que se abona más de $12000 en sueldos docentes.
select distinct departamento
from docmat
where salario > 12000;

-- c. listar los nombres y carga horaria de las materias y los nombres y apellidos de los docentes cuyo título es analista de sistemas.
select materia.nombre as materia, materia.carga_horaria, docente.nombre, docente.apellido
from materia
join docmat on materia.cod_mat = docmat.cod_mat
join docente on docmat.dni = docente.dni
where docente.titulo = 'analista de sistemas';