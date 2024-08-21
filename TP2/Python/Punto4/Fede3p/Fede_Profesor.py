class Fede_Profesor:
    
    __nombre = ""
    __apellido = ""
    
    def __init__(self, nombre, apellido):
        self.__nombre = nombre
        self.__apellido = apellido
    
    @property
    def nombre(self):
        return self.__nombre
    
    @nombre.setter
    def set_nombre(self, nombre):
        self.__nombre = nombre
        
    @property
    def Apellido(self):
        return self.__apellido
    
    @apellido.setter
    def set_apellido(self, apellido):
        self.__apellido = apellido
        
    def add_materia(self, materia):
        self.__materia.add(materia)