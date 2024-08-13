
class Persona:
    def __init__(self,nombre,apellido,fecha_nacimiento):
        self.__nombre = nombre
        self.__apellido = apellido
        self.__fecha_nacimiento = fecha_nacimiento
    
@property
def nombre(self):
    return self.__nombre
@nombre.setter
def set_nombre(self,nombre):
    self.__nombre = nombre
@property
def FechaNacimiento(self):
    return self.__fecha_nacimiento

@property
def apellido(self):
    return self.__apellido 

@apellido.setter
def set_apellido(self,apellido):
    self.__apellido = apellido

@FechaNacimiento.setter
def set_FechaNacimiento(self, fecha_nacimiento):
    self.__fecha_nacimiento = fecha_nacimiento

def toString(self):
    return f"Nombre: {self.__nombre}, Apellido: {self.__apellido}, Fecha de nacimiento: {self.__fecha_nacimiento}"
def imprimir(self):
    print("{}  {}  {}".format(self.__nombre,self.__apellido,self.__fecha_nacimiento))
