class Censo:
    def __init__(self,comuna,familia):
        self.__comuna = comuna
        self.__familia = familia
        self.__Persona = []

    @property
    def comuna(self):
        return self.__comuna

    @comuna.setter
    def comuna(self,comuna):
        self.__comuna = comuna
    @property
    def familia(self):
        return self.__familia

    @familia.setter
    def familia(self,familia):
        self.__familia = familia
    
    def agregar_persona (self,Persona):
        self.__Persona.append(Persona)
    def imprimir(self):
        print("Familia: ",self.__familia)
        print("Integrantes:")
        ContadorPersonas = 0
        for pepe in self.__Persona:
            ContadorPersonas = ContadorPersonas + 1
            pepe.Imprimir()
        return ContadorPersonas

