class Categoria:
    def __init__(self, titulo):
        self.__titulo = titulo
        self.__Articulo = []
        
    def agregar_articulo(self,Articulo):
        self.__Articulo.append(Articulo)
    
    def imprimir(self):
        print(self.__titulo)
        for pepe in self.__Articulo:
            pepe.imprimir()
        
    