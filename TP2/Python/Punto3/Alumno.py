class Alumno:
    def __init__(self):
        self.__nombre =''
        self.__apellido = ''
        self.__dni = 0
    
    def __init__(self):
        pass
    
    @classmethod
    def iniciar_con_nom_ape(cls, nombre, apellido):
        alumno = cls.__new__(cls)
        alumno.__nombre = nombre
        alumno.__apellido = apellido
        return alumno
    
    @property
    def nombre
    
    @__nombre.setter 
    def __nombre(self, valor):
        self.__nombre = valor
    