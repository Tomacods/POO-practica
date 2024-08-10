import datetime

class Ticket:
    
    def __init__(self, nroVenta):
        self.nroVenta = nroVenta
        self.fecha = datetime.now()
        self.productos = []
        
    def agregarProducto(self, producto):
        self.productos.append(producto)
    
    def calcularTotal(self):
        total = 0.0
        for produ in self.productos:
            total += produ.getPrecio()
        return total
    
    def imprimir(self):
        print("Nro de venta: {}          Fecha: {}".format(self.nroVenta, self.fecha))
        print("Articulo       Dosis          Precio")
        for produ in self.productos:
            produ.imprimir()
        print("                         Total:", self.calcularTotal())