class Cancion:
    
    def __init__(self, nombre, autor, duracion):
        self.__nombre = nombre
        self.__autor = autor
        self.__duracion = duracion
        
    def Imprimir (self):
        print(self.__nombre)
        print(self.__autor)
        print(self.__duracion)
    