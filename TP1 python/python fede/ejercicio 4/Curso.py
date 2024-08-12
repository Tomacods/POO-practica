class Curso:
    
    def __init__ (self, urlJpg, titulo, proveedor, puntuacion, estrellas, resenas, descuento, precio, etiqueta):
        self.urlJpg = urlJpg
        self.titulo = titulo
        self.proveedor = proveedor
        self.puntuacion = puntuacion
        self.estrellas = estrellas
        self.resenas = resenas
        self.descuento = descuento
        self.precio = precio
        self.etiqueta = etiqueta
        
    def imprimirCurso(self):
        print(self.urlJpg)
        print(self.titulo)
        print(self.proveedor)
        print(self.puntuacion, "    ", self.estrellas, "    ", self.resenas)
        print("$", self.descuento, "    $", self.precio)
        print(self.etiqueta)