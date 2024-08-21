from Fede_Materia import Fede_Materia
from Fede_Profesor import Fede_Profesor

poo = Fede_Materia("POO", "IF153")
algebra = Fede_Materia("Algebra", "IF183")
introduccion = Fede_Materia("Introduccion a la computacion", "IF300")
algoritmica = Fede_Materia("Algoritmica", "IF500")

profesores = []

profesor1 = Fede_Profesor("Pedro", "Hernandez")
profesor1.add_materia(poo)
profesor1.add_materia(algebra)
profesores.append(profesor1)

profesor2 = Fede_Profesor("Romina", "ALvarez")
profesor2.add_materia(introduccion)
profesor2.add_materia(algoritmica)
profesores.append(profesor2)

profesor3 = Fede_Profesor("Laura", "Perez")
profesores.append(profesor3)

for pro in profesores:
    pro.imprimir()
