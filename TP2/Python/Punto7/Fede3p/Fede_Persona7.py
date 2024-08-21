from datetime import date

class Fede_Persona7:
        
    def __init__(self, nombre, apellido, nacimiento):
        self.__nombre = nombre
        self.__apellido = apellido
        self.__nacimiento = nacimiento
        
    @property
    def nombre(self):
        return self.__nombre
    
    @nombre.setter
    def set_nombre(self, nombre):
        self.__nombre = nombre
        
    @property
    def apellido(self):
        return self.__apellido
    
    @apellido.setter
    def set_apellido(self, apellido):
        self.__apellido = apellido
    
    @property
    def nacimiento(self):
        return self.__nacimiento
    
    @nacimiento.setter
    def set_nacimiento(self, nacimiento):
        self.__nacimiento = nacimiento
    
    def edad(self):
        return (date.today - self.__nacimiento)
        
    def __str__(self):
        return f'{"Nombre:"}{self.nombre}{" -  Apellido:"}{self.apellido}{" -  Fecha de nacimiento:"}{self.nacimiento}{" -  Edad:"}{self.edad}'