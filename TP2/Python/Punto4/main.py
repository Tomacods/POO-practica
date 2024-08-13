from Materia import Materia
from Profesor import Profesor

materia1 = Materia("POO","I42")
materia2 = Materia("Algebra","I32")
materia3 = Materia("Introduccion a la computacion","I31")
materia4 = Materia("Algoritmica","I93")

profesor1 = Profesor("Pedro","Hernandez")
profesor2 = Profesor("Romina","Alvarez")
profesor3 = Profesor("Laura","Perez")

profesor1.agregar_Materia(materia1)
profesor1.agregar_Materia(materia2)
profesor2.agregar_Materia(materia3)
profesor2.agregar_Materia(materia4)

Profesor.imprimir(profesor1)
Profesor.imprimir(profesor2)
Profesor.imprimir(profesor3)

