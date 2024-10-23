CREATE PROCEDURE sp_ejercicio_14
    @dni_profesional int
AS
BEGIN

    declare  @horas real,
        @fecha_turno date,
        @nombre_completo varchar (200)

    select @nombre_completo = p.apellido_profesional + ', ' + p.nombre_profesional 
    from profesionales p
    where p.dni_profesional = @dni_profesional

        create table resultado# (dni int, fecha date, horas real)
declare x cursor for
    select cast(fecha_turno as date) as fecha_turno
    from turnos
    where dni_profesional = @dni_profesional
    group by cast(fecha_turno as date) 

    open x

    fetch next from x
    into @fecha_turno

    while @@FETCH_STATUS = 0
        begin
            set @horas = 0
            --exec sp_calcular_horas_trabajadas @dni_profesional, @fecha_turno, @horas output
            insert into resultado# (dni, nombre_completo, fecha, horas)
            values(@dni_profesional, @nombre_completo, @fecha_turno, @horas)
            fetch next from x
            into @fecha_turno
        end

    close x
    deallocate x

    select *
    from resultado#

    drop table resultado#
    --aguante boca
END
GO