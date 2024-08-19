class Fede_Alumno:
    
    def __init__(self, nombre, apellido, dni):
        self.__nombre = nombre
        self.__apellido = apellido
        self.__dni = dni
        
    def __str__(self):
        return f'{self.__nombre}{" "}{self.__apellido}{" - Dni: "}{self.__dni}'
    
    #@classmethod
    def iniciar_con_nom_ape(cls, nombre, apellido):
        alumno = cls.__new__(cls)
        alumno.__nombre = nombre
        alumno.__apellido = apellido
        return alumno
    
    @property
    def nombre(self):
        return self.__nombre
    
    @nombre.setter
    def nombre(self, nombre):
        self.__nombre = nombre
        
    @property
    def apellido(self):
        return self.__apellido
    
    @apellido.setter
    def apellido(self, apellido):
        self.__apellido = apellido
        
    @property
    def dni(self):
        return self.__dni
    
    @dni.setter
    def dni(self, dni):
        self.__dni = dni