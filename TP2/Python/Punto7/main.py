from Persona import Persona
from datetime import date

persona1 = Persona("Mora", "Molina", date(2003, 7, 25))
persona2 = Persona("Macarena", "Lopez", date(1999, 3, 1))
persona3 = Persona("Fernando", "Perez", date(2007, 12, 14))

persona1.toString()
persona2.toString()
persona3.toString()
persona1.getEdad() #NO SE PQ NO ANDA