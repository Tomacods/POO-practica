class Telefono:
    def __init__(self, marca, imei, modelo, descrip, precio):
        self.__marca = marca
        self.__imei = imei
        self.__modelo = modelo
        self.__descrip = descrip
        self.__precio = precio

    def __str__(self) :
        return f'Telefono({self.__marca} {self.__imei} {self.__modelo}{self.__descrip}{self.__precio})'





