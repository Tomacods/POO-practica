class FedeCancion:
    
    def __init__(self, nombre, autor, duracion):
        self.__nombre = nombre
        self.__autor = autor
        self.__duracion = duracion
        
    def imprimir(self):
        print(self.__nombre)
        print(self.__autor)
        print(self.__duracion)
    
    @property
    def nombre(self):
        return self.__nombre
    
    @nombre.setter
    def nombre(self, nombre):
        self.__nombre = nombre
        
    @property
    def autor(self):
        return self.__autor
    
    @autor.setter
    def autor(self, autor):
        self.__autor = autor
        
    @property
    def duracion(self):
        return self.__duracion
    
    @duracion.setter
    def duracion(self, duracion):
        self.__duracion = duracion