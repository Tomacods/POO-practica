CREATE PROCEDURE listar_turnos(
    IN dni_profesional INT,
    IN fecha DATE
)
BEGIN
    -- tabla temporal para guardar los horarios ocupados
    CREATE TEMPORARY TABLE HorariosOcupados AS (
        SELECT t.hora_desde, t.dni_profesional, p.nombre_profesional, p.apellido_profesional, t.codigo_especialidad, e.descripcion_especialidad
        FROM turnos t
        JOIN profesionales p ON t.dni_profesional = p.dni_profesional
        JOIN especialidades e ON t.codigo_especialidad = e.codigo_especialidad
        WHERE t.fecha_turno = fecha
        AND (dni_profesional IS NULL OR t.dni_profesional = dni_profesional)
    );

    
    SELECT h.hora_desde, h.dni_profesional, p.nombre_profesional, p.apellido_profesional, h.codigo_especialidad, e.descripcion_especialidad,
            CASE WHEN ho.hora_desde IS NOT NULL THEN 'Ocupado' ELSE 'Disponible' END AS estado
    FROM horarios h
    LEFT JOIN HorariosOcupados ho ON h.hora_desde = ho.hora_desde 
                                    AND h.dni_profesional = ho.dni_profesional
                                    AND h.codigo_especialidad = ho.codigo_especialidad
    JOIN profesionales p ON h.dni_profesional = p.dni_profesional
    JOIN especialidades e ON h.codigo_especialidad = e.codigo_especialidad
    JOIN dias_semana d ON h.codigo_dia_semana = d.codigo_dia_semana
    WHERE d.codigo_dia_semana = DAYOFWEEK(fecha)
    AND (dni_profesional IS NULL OR h.dni_profesional = dni_profesional)
    ORDER BY p.apellido_profesional, p.nombre_profesional, h.hora_desde;

    DROP TEMPORARY TABLE HorariosOcupados;
END 