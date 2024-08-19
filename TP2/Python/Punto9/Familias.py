class Familias:
    def __init__(self,Comuna):
        self.__comuna = Comuna
        self.__Familia = []
        
    @property
    def comuna(self):
        return self.__comuna
    @comuna.setter
    def comuna(self, comuna):
        self.__comuna = comuna
    def Agregar_familia (self,Familia):
        self.__Familia.append(Familia)
        
    def imprimir_familias(self):
        print("Comuna: ",self.__comuna)
        print("Familias:")
        ContadorFamilia = 0
        ContadorPersonas = 0
        for pepe in self.__Familia:
            ContadorFamilia = ContadorFamilia + 1
            ContadorPersonas = ContadorPersonas + pepe.imprimir()
            
        print("Cantidad de Personas: ",ContadorPersonas)
        return ContadorFamilia 