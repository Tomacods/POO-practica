class Lista:
    
    def __init__(self):
        self.cursos = []
        
    def agregarCurso(self, curso):
        self.cursos.append(curso)
        
    def imprimirCursos(self):
        for cur in self.cursos:
            cur.imprimirCurso()