-- ================================================
-- Template generated from Template Explorer using:
-- Create Procedure (New Menu).SQL
--
-- Use the Specify Values for Template Parameters 
-- command (Ctrl-Shift-M) to fill in the parameter 
-- values below.
--
-- This block of comments will not be included in
-- the definition of the procedure.
-- ================================================
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE sp_horarios_profesionales_masc
AS
BEGIN
    -- Insert statements for procedure here
SELECT DISTINCT p.nombre_profesional + '' + p.apellido_profesional AS profesional, 
e.descripcion_especialidad AS especialidad, DATEPART(HOUR, t.hora_desde) AS Hora, 
CASE 
WHEN h.codigo_dia_semana = 0 THEN 'Domingo'
WHEN h.codigo_dia_semana = 1 THEN 'Lunes'
WHEN h.codigo_dia_semana = 2 THEN 'Martes'
WHEN h.codigo_dia_semana = 3 THEN 'Miercoles'
WHEN h.codigo_dia_semana = 4 THEN 'Jueves'
WHEN h.codigo_dia_semana = 5 THEN 'Viernes'
WHEN h.codigo_dia_semana = 6 THEN 'Sabado'
END as Dia, p.genero_profesional
FROM profesionales p JOIN turnos t ON p.dni_profesional = t.dni_profesional
JOIN horarios h ON t.codigo_dia_semana = h.codigo_dia_semana
JOIN especialidades e ON t.codigo_especialidad = e.codigo_especialidad
WHERE p.genero_profesional = 'Masculino'
ORDER BY e.descripcion_especialidad


END
GO
