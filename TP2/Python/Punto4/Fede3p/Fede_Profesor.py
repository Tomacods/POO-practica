class Profesor:
    
    __nombre = ""
    __apellido = ""
    __materia = ""
    
    def __init__(self, nombre, apellido):
        self.__nombre = nombre
        self.__apellido = apellido
        
    def add_materia(self, materia):
        self.__materia.add(materia)
    
    def getNombre(self):
        return self.__nombre
    
    def set_nombre(self, nombre):
        self.__nombre = nombre
        
    def getApellido(self):
        return self.__apellido
    
    def set_apellido(self, apellido):
        self.__apellido = apellido
        
    def getMateria(self):
        return self.__materia
    
    def set_materia(self, materia):
        self.__materia = materia