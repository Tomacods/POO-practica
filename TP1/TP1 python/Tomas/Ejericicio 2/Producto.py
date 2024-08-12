
class Producto:
    def __init__(self, nombre, dosis,gramaje, precio):
        self.nombre = nombre
        self.dosis = dosis
        self.gramaje = gramaje
        self.precio = precio
        
    
    def getPrecio(self):
        return self.precio
    
    
    def imprimir(self):
        print("{}    {}{}              {}".format(self.nombre, self.dosis, self.gramaje, self.precio))