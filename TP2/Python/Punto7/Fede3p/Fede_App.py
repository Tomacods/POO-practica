from Fede_Persona7 import Fede_Persona7
from datetime import date

persona1 = Fede_Persona7("Federica", "Roldan", date(2003,9,22))
persona2 = Fede_Persona7("Mora", "Molina", date(2003,7,25))
persona3 = Fede_Persona7("Tomas", "Da Silva", date(2000,3,9))
persona4 = Fede_Persona7("Cesar", "Millavanque", date(1999,7,13))

print(persona1)
print("Edad: ",persona1.getEdad())
print(persona2)
print("Edad: ",persona2.getEdad())
print(persona3)
print("Edad: ",persona3.getEdad())
print(persona4)
print("Edad: ",persona4.getEdad())