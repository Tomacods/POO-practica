class Profesor:
    def __init__(self, nombre,apellido):
        self.__nombre = nombre
        self.__apellido = apellido
        self.__Materia = []
    
    @property
    def nombre(self):
        return self.__nombre
    
    @property
    def apellido(self):
        return self.__apellido
    
    @nombre.setter
    def set_nombre(self,nombre):
        self.__nombre = nombre
    
    @apellido.setter
    def set_apellido(self,apellido):
        self.__apellido = apellido
    
    def agregar_Materia(self,Materia):
        self.__Materia.append(Materia)
    
    def imprimir(self):
        print("Profesor: ",self.__apellido,self.__nombre)
        print("Materias:")
        for pepe in self.__Materia:
            pepe.Imprimir()
            
        
    