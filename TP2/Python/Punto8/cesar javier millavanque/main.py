from Persona import Persona
from Censo import Censo

persona1 = Persona("César","Millavanque",25,"Si","No",'M')
persona2 = Persona("Javier","Millavanque",51,"No","Si",'M')
persona3 = Persona("Marcela","Romero",55,"No","Si",'F')
persona4 = Persona("Tomas","Millavanque",16,"Si","No",'M')

familia1 = Censo("Sarmiento","Millavanque")
familia1.agregar_persona(persona1)
familia1.agregar_persona(persona2)
familia1.agregar_persona(persona3)
familia1.agregar_persona(persona4)

familia1.imprimir()
