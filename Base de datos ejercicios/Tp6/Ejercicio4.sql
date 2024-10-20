-- Crear un stored procedure que liste todos los horarios de los profesionales
-- masculinos por especialidad.

SELECT DISTINCT 
        p.nombre_profesional || ' ' || p.apellido_profesional AS profesional, 
        e.descripcion_especialidad AS especialidad, 
        EXTRACT(HOUR FROM h.hora_desde) AS Hora, 
        CASE 
            WHEN h.codigo_dia_semana = 0 THEN 'Domingo'
            WHEN h.codigo_dia_semana = 1 THEN 'Lunes'
            WHEN h.codigo_dia_semana = 2 THEN 'Martes'
            WHEN h.codigo_dia_semana = 3 THEN 'Miércoles'
            WHEN h.codigo_dia_semana = 4 THEN 'Jueves'
            WHEN h.codigo_dia_semana = 5 THEN 'Viernes'
            WHEN h.codigo_dia_semana = 6 THEN 'Sábado'
        END AS Dia, 
        p.genero_profesional
    FROM profesionales p 
    JOIN horarios h ON p.dni_profesional = h.dni_profesional
    JOIN especialidades e ON h.codigo_especialidad = e.codigo_especialidad
    WHERE p.genero_profesional = 'Masculino'
    ORDER BY e.descripcion_especialidad;


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
create table persona (
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