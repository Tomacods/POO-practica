CREATE PROCEDURE CalcularHorasTrabajadas
    @dni_profesional INT,
    @fecha_consulta DATE,
    @horas INT OUTPUT
AS
BEGIN
    DECLARE @total_minutos INT;

    SELECT @total_minutos = SUM(DATEDIFF(MINUTE, hora_desde, DATEADD(MINUTE, duracion, hora_desde)))
    FROM horarios
    WHERE dni_profesional = @dni_profesional
    AND CAST(hora_desde AS DATE) = @fecha_consulta;

    SET @horas = @total_minutos / 60;
END;