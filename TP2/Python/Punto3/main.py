from Alumno import Alumno 

alumno1 = Alumno()
#alumno1 = alumno1.iniciar()
alumno1.nombre="Alejandro"
alumno1.apellido="Rojas"
alumno1.dni=11111111

alumno2= Alumno().iniciar_con_nom_ape("Martin", "Rosales")
alumno2.dni=11111112

print(f'{alumno1.getNombreYapellido()}{" - DNI"}{alumno1.dni}')
print(f'{alumno2.getNombreYapellido()}{" - DNI"}{alumno2.dni}')