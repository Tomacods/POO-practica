class Materia:
    __nombre = ""
    __codigo = ""
    
    def __init__(self, nombre, codigo):
        self.__nombre = nombre
        self.__codigo = codigo
        
    def getNombre(self):
        return self.__nombre
    
    def set_nombre(self, nombre):
        self.__nombre = nombre
        
    def getCodigo(self):
        return self.__codigo
    
    def set_nombre(self, codigo):
        self.__codigo = codigo