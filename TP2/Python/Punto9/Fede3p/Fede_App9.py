from Fede_Persona9 import Fede_Persona9
from Fede_Censo9 import Fede_Censo9
from datetime import date

familias = []

# Familia 1

persona1 = Fede_Persona9("Federica", "Roldán", date(2003, 9, 22), "Femenino", True, False)
persona2 = Fede_Persona9("Santiago", "Roldán", date(2006, 6, 28), "Masculino", True, False)
persona3 = Fede_Persona9("Marcelo", "Roldán", date(1974, 3, 4), "Masculino", False, True)
persona4 = Fede_Persona9("Andrea", "Bravo", date(1977, 11, 21), "Femenino", True, True)

familia1 = Fede_Censo9("Familia Roldán")

familia1.agregarPersona(persona1)
familia1.agregarPersona(persona2)
familia1.agregarPersona(persona3)
familia1.agregarPersona(persona4)

familias.append(familia1)

# Familia 2

persona5 = Fede_Persona9("Maiten", "Berrios", date(2003, 9, 22), "Femenino", True, False)
persona6 = Fede_Persona9("Lonkimey", "Berrios", date(2006, 6, 28), "Masculino", True, False)
persona7 = Fede_Persona9("Lorena", "Bravo", date(1977, 11, 21), "Femenino", True, True)

familia2 = Fede_Censo9("Familia Berrios")

familia2.agregarPersona(persona5)
familia2.agregarPersona(persona6)
familia2.agregarPersona(persona7)

familias.append(familia2)

# Familia 3

persona8 = Fede_Persona9("Paula", "Bravo", date(2003, 9, 22), "Femenino", True, False)
persona9 = Fede_Persona9("Katalina", "Bravo", date(2006, 6, 28), "Femenino", True, False)
persona10 = Fede_Persona9("Leonel", "Bravo", date(1974, 3, 4), "Masculino", False, True)

familia3 = Fede_Censo9("Familia Bravo")

familia3.agregarPersona(persona8)
familia3.agregarPersona(persona9)
familia3.agregarPersona(persona10)

familias.append(familia3)

# código principal

edades = 0
cant = 0
print("Se censaron a ", len(familias), " familias.")
print(" ")
for fam in familias:
    fam.imprimirFamilia()
    fam.cantidad1()
    print(" ")
    fam.cantTrabajan()
    edades = edades + fam.totalEdad()
    cant = cant + fam.cantidad2()
    print(" ")
    print("---------------------")
    print(" ")
total = (edades/cant)
print("La edad promedio es: ", total)

