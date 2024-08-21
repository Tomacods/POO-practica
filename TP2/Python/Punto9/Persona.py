class Persona:
    def __init__(self,nombre,apellido,edad,estudio,trabaja,sexo):
        self.__nombre = nombre
        self.__apellido = apellido
        self.__edad = edad
        self.__estudio = estudio
        self.__trabaja = trabaja
        self.__sexo = sexo
    
    @property
    def nombre(self):
        return self.__nombre
    
    @nombre.setter
    def nombre(self,nombre):
        self.__nombre = nombre
    
    @property
    def edad(self):
        return self.__edad

    @property
    def apellido(self):
        return self.__apellido 

    @apellido.setter
    def apellido(self,apellido):
        self.__apellido = apellido

    @edad.setter
    def edad(self, edad):
        self.__edad = edad

    @property
    def estudio(self):
        return self.__estudio
    
    @estudio.setter
    def estudio(self,estudio):
        self.__estudio = estudio
        
    @property
    def trabaja(self):
        return self.__trabaja
    
    @trabaja.setter
    def trabaja(self,trabaja):
        self.__trabaja = trabaja
        
    @property
    def sexo(self):
        return self.__sexo
    
    @sexo.setter
    def sexo(self,sexo):
        self.__sexo = sexo

    def Imprimir(self):
        print("Nombre: {} Apellido: {} Edad: {} Estudia:{} Trabaja :{} Sexo: {}".format(self.__nombre,self.__apellido,self.__edad,self.__estudio,self.__trabaja,self.__sexo))

