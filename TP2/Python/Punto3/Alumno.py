class Alumno:
    #def __init__(self):
    # __nombre =''
    #__apellido = ''
    #__dni = 0
    
    def __init__(self, nombre='', apellido='', dni=0):
        self.__nombre = nombre
        self.__apellido = apellido
        self.__dni = dni
    
    #def __init__(self):
    #    pass
    
    @classmethod
    def iniciar_con_nom_ape(cls, nombre, apellido):
        alumno = cls.__new__(cls)
        alumno.__nombre = nombre
        alumno.__apellido = apellido
        return alumno
    
    @property
    def nombre(self):
        return self.__nombre
    
    @nombre.setter 
    def nombre(self, valor):
        self.__nombre = valor
        
    @property
    def apellido(self):
        return self.__apellido
    
    @apellido.setter 
    def apellido(self, valor):
        self.__apellido = valor
    
    @property
    def dni(self):
        return self.__dni
    
    @dni.setter 
    def dni(self, valor):
        self.__dni = valor
    
    def getNombreYapellido(self):
        return f"{self.__nombre} {self.__apellido}"