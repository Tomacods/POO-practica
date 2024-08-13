class Materia:
    def __init__(self,nombre,codigo):
        self.__nombre = nombre
        self.__codigo = codigo
    @property
    def nombre(self):
        return self.__nombre
    @property
    def codigo(self):
        return self.__codigo
    @nombre.setter
    def set_nombre(self,nombre):
        self._nombre = nombre
    @codigo.setter
    def set_codigo(self,codigo):
        self._codigo = codigo
    def Imprimir (self):
        print("{}  {}".format(self.__nombre,self.__codigo))