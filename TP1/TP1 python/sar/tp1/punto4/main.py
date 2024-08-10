
from Libro import Libro
from Categoria import Categoria
##self.__img, self.__titulo,self.__autor,self.__calificacion,self.__precio)
articulo = Libro("imagen","Libro Python","Messi Lionel","3 Estrellas","U$D 10")
Categoria = Categoria("Mas vendidos")
Categoria.agregar_articulo(articulo)
Categoria.imprimir()
