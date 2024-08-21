class Fede_Profesor:
    
    __nombre = ""
    __apellido = ""
    
    
    def __init__(self, nombre, apellido):
        self.__nombre = nombre
        self.__apellido = apellido
        self.__materia = []  
    def get_nombre(self):
        return self.__nombre
    
    def set_nombre(self, nombre):
        self.__nombre = nombre
        
    def get_apellido(self):
        return self.__apellido
    
    def set_apellido(self, apellido):
        self.__apellido = apellido
        
    def add_materia(self, materia):
        self.__materia.append(materia)
        
    def imprimir(self):
        print(f'{"Profesor: "}{self.__nombre}{", "}{self.__apellido}')
        print("Materias:")
        for mat in self.__materia:
            mat.imprimir_materia()