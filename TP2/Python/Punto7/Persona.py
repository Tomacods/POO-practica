from datetime import date



class Persona:
    def __init__(self, nombre, apellido, fechaNac):
        self.__nombre = nombre
        self.__apellido = apellido
        self.__fechaNac = fechaNac
        
    #getters
    @property
    def nombre(self):
        return self.__nombre
    
    @property
    def apellido(self):
        return self.__apellido
    
    @property
    def fechaNac(self):
        return self.__fechaNac
    
    #setters
    @nombre.setter
    def nombre (self, nombre):
        self.__nombre = nombre 
        
    @apellido.setter
    def apellido (self, apellido):
        self.__apellido = apellido 
        
    @fechaNac.setter
    def fechaNac (self, fechaNac):
        self.__fechaNac = fechaNac
        
    def toString (self):
        print("nombre: " + self.__nombre + " apellido: " + self.__apellido + " fecha de nacimiento: " + str(self.__fechaNac))
    
    def getEdad (self): 
        hoy = date.today()
        fnac = self.__fechaNac
        edad = (hoy - fnac)
        edad = edad.days/365
        return int(edad)
        #NO SE PQ NO ANDA
