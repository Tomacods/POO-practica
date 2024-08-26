from abc import ABC, abstractmethod

class Fede_Personaje(ABC):
    
    def __init__(self, nombre, vida, nivelAtaque, nivelDefensa):
        self.__nombre = nombre
        self.__vida = vida
        self.__nivelAtaque = nivelAtaque
        self.__nivelDefensa = nivelDefensa
        
    def atacar(self):
        return self.__nivelAtaque
    
    @abstractmethod
    def defender(ataque):
        pass
    
    def getNombre(self):
        return self.__nombre
    
    def setNombre(self, nombre):
        self.__nombre = nombre
    
    def getVida(self):
        return self.__vida
    
    def setVida(self, vida):
        self.__vida = vida
        
    def getNivelDefensa(self):
        return self.__nivelDefensa
        
    def setNivelDefensa(self, nivelDefensa):
        self.__nivelDefensa = nivelDefensa
        
    def recibirDanio(self, danio):
        self.__vida = self.__vida - danio