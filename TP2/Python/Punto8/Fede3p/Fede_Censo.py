class Fede_Censo:
    
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
        for per in self.__personas:
            per.imprimirPersona()