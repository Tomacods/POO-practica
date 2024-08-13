class Producto:
    
    def __init__(self, articulo, dosis, unidadDosis, precio): #constructor de la clase
        self.articulo = articulo
        self.dosis = dosis
        self.unidadDosis = unidadDosis
        self.precio = precio
        
    def getPrecio(self):
        return self.precio
    
    def imprimir(self):
        print("{}       {}{}       {}".format(self.articulo, self.dosis, self.unidadDosis, self.precio))