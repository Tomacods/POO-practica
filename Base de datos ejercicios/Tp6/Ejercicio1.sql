create procedure sp_nombre_fecha_nacimiento
AS
BEGIN
    SELECT nombre_persona, fecha_nacimiento
    FROM personas;
END;
-- el procedimiento almacenado sp_nombre_fecha_nacimiento devuelve el nombre y la fecha de nacimiento de todas las personas en la tabla personas


exec sp_nombre_fecha_nacimiento --ejecuta el procedimiento almacenado sp_nombre_fecha_nacimiento