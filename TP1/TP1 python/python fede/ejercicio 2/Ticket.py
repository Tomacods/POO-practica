from datetime import datetime #importo la libreria datetime

class Ticket:
    
    def __init__(self, nroVenta): #constructor de la clase
        self.nroVenta = nroVenta
        self.fecha = datetime.now()
        self.productos = []
        
    def agregarProducto(self, producto):
        self.productos.append(producto) #el append agrega un elemento a la lista 
    
    def calcularTotal(self): #metodo para calcular el total de la venta
        total = 0.0
        for produ in self.productos:
            total += produ.getPrecio()
        return total
    
    def imprimir(self): #metodo para imprimir el ticket
        print("Nro de venta: {}          Fecha: {}".format(self.nroVenta, self.fecha))
        print("Articulo       Dosis          Precio")
        for produ in self.productos:
            produ.imprimir()
        print("                         Total:", self.calcularTotal())