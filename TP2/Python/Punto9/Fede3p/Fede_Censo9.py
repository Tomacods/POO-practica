class Fede_Censo9:
    
    def __init__(self, familia):
        self.__familia = familia
        self.__personas = []
        
    @property
    def familia(self):
        return self.__familia
    
    @familia.setter
    def set_familia(self, familia):
        self.__familia = familia
        
    def agregarPersona(self, persona):
        self.__personas.append(persona)
    
    def imprimirFamilia(self):
        print("Familia: ", self.__familia)
        print(" ")
        print("Integrantes: ")
        for per in self.__personas:
            per.imprimirPersona()
            print(" ")
            
    def cantidad1(self):
        print("Esta familia tiene ", len(self.__personas), " integrantes")
    
    def cantidad2(self):
        return len(self.__personas)
    
    def totalEdad(self):
        edad = 0
        for per in self.__personas:
            edad = edad + per.getEdad()
        return int(edad)
    
    def cantTrabajan(self):
        cant = 0
        for per in self.__personas:
            if per.trabaja:
                cant = cant + 1
        print("En esta familia trabajan ", cant, " personas.")