from Fede_Persona8 import Fede_Persona8
from Fede_Censo import Fede_Censo
from datetime import date

persona1 = Fede_Persona8("Federica", "Roldán", date(2003, 9, 22), "Femenino", True, False)
persona2 = Fede_Persona8("Santiago", "Roldán", date(2006, 6, 28), "Masculino", True, False)
persona3 = Fede_Persona8("Marcelo", "Roldán", date(1974, 3, 4), "Masculino", False, True)
persona4 = Fede_Persona8("Andrea", "Bravo", date(1977, 11, 21), "Femenino", True, True)

familia = Fede_Censo("Familia Roldán")

familia.agregarPersona(persona1)
familia.agregarPersona(persona2)
familia.agregarPersona(persona3)
familia.agregarPersona(persona4)

familia.imprimirFamilia()