class Serie:
    
    def __init__(self, urlJpg, titulo, estreno):
        self.urlJpg = urlJpg
        self.titulo = titulo
        self.estreno = estreno
        
    def imprimirSerie(self):
        print("{}       {}       {}".format(self.urlJpg, self.titulo, self.estreno))