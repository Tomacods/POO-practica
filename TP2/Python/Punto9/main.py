from Persona import Persona
from Censo import Censo
from Familias import Familias
persona1 = Persona("César","Millavanque",25,"Si","No",'M')
persona2 = Persona("Javier","Millavanque",51,"No","Si",'M')
persona3 = Persona("Marcela","Romero",55,"No","Si",'F')
persona4 = Persona("Tomas","Millavanque",16,"Si","No",'M')

familia1 = Censo("Sarmiento","Millavanque")
familia1.agregar_persona(persona1)
familia1.agregar_persona(persona2)
familia1.agregar_persona(persona3)
familia1.agregar_persona(persona4)
comuna1 = Familias("Sarmiento")
comuna1.Agregar_familia(familia1)
print("Cantidad de Familias :", comuna1.imprimir_familias())
