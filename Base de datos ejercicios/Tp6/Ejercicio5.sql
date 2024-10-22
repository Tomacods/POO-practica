CREATE PROCEDURE sp_turnos_persona_infectologia
    @dni_persona int
AS
BEGIN
    SELECT 
        t.numero_turno,
        t.fecha_turno,
        t.dni_persona,
        t.dni_profesional,
        t.codigo_especialidad,
        t.codigo_dia_semana,
        t.hora_desde
    FROM turnos t
    JOIN especialidades e ON t.codigo_especialidad = e.codigo_especialidad
    WHERE t.dni_persona = @dni_persona
    AND e.descripcion_especialidad = 'Infectologia';
END;
GO