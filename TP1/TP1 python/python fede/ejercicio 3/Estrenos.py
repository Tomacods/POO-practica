class Estrenos:
    
    def __init__(self, titulo):
        self.titulo = titulo
        self.series = []
        
    def agregarSerie(self, serie):
        self.series.append(serie)
        
    def imprimir(self):
        for ser in self.series:
            ser.imprimirSerie()