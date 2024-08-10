
class Libro:
    
    def __init__(self,titulo,autor,img,calificacion,precio):
        self.__titulo = titulo
        self.__autor = autor
        self.__img = img
        self.__calificacion = calificacion
        self.__precio = precio
        
    def imprimir(self):
        print("{}  {}  {}  {}  {}".format(self.__img, self.__titulo,self.__autor,self.__calificacion,self.__precio))
        