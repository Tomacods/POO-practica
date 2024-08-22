from datetime import date

class Fede_Persona8:
        
    def __init__(self, nombre, apellido, nacimiento, sexo, estudia, trabaja):
        self.__nombre = nombre
        self.__apellido = apellido
        self.__nacimiento = nacimiento
        self.__sexo = sexo
        self.__estudia = estudia
        self.__trabaja = trabaja
        
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
        
    @property
    def sexo(self):
        return self.__sexo
    
    @sexo.setter
    def set_sexo(self, sexo):
        self.__sexo = sexo
        
    @property
    def estudia(self):
        return self.__estudia
    
    @estudia.setter
    def set_estudia(self, estudia):
        self.__estudia = estudia
        
    @property
    def trabaja(self):
        return self.__trabaja
    
    @trabaja.setter
    def set_trabaja(self, trabaja):
        self.__trabaja = trabaja
        
    def getEdad(self): 
        hoy = date.today()
        fnac = self.__nacimiento
        edad = (hoy - fnac)
        edad = edad.days/365
        return int(edad)
    
    def __str__(self):
        return f'{"Nombre:"}{self.nombre}{" -  Apellido:"}{self.apellido}{" -  Fecha de nacimiento:"}{self.nacimiento}'
    
    def imprimirPersona(self):
        print("Nombre y apellido: ", self.__nombre, " ", self.__apellido)
        print("Fecha de nacimiento: ", self.__nacimiento)
        print("Edad: ", self.getEdad())
        print("Estudia? ", self.__estudia, "  -  Trabaja? ", self.__trabaja)