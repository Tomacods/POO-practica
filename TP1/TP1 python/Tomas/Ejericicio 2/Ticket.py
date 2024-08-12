from datetime import datetime


class Ticket:
    def __init__(self, nroVenta):
        self.nroVenta = nroVenta
        self.fecha = datetime.now()
        self.producto = []
    
    def agregarProducto(self, producto):
        self.producto.append(producto)
    
    def calcularTotal(self):
        total = 0.0
        for produ in self.producto:
            total += produ.getPrecio()
        return total
    
    def imprimir(self):
        print("Nro de venta: {}          Fecha: {}".format(self.nroVenta, self.fecha))
        print("Articulo       Dosis          Precio")
        for produ in self.producto:
            produ.imprimir()
        print("                         Total:", self.calcularTotal())
        
    def getNroVenta(self):
        return self.nroVenta
    
    def getgramaje(self):
        return self.gramaje
