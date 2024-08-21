class Fede_Materia:

    def __init__(self, nombre, codigo):
        self.__nombre = nombre
        self.__codigo = codigo
        
    def get_nombre(self):
        return self.__nombre
    
    def set_nombre(self, nombre):
        self.__nombre = nombre
    
    def get_codigo(self):
        return self.__codigo
    
    def set_nombre(self, codigo):
        self.__codigo = codigo
        
    def imprimir_materia(self):
        print("Nombre:", self.__nombre)
        print("Codigo:", self.__codigo)