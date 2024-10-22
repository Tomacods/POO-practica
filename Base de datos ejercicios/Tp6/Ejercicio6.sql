
create procedure EjemploProcedimiento
as 
begin 
declare @Variable int; -- declaracion de variable interna

set @Variable = 1; -- asignacion de valor a la variable

select @Variable as ValorDeLaVariable; -- muestra el valor de la variable
end;
