from Serie import Serie
from Estrenos import Estrenos

s1 = Serie("image", "Doom Patrol", "Nuevos episodios todos los jueves")
s2 = Serie("image", "Planeta de Recolectores", "Nuevos episodios todos los jueves")
s3 = Serie("image", "Rick and Morty", "Nuevos episodios todos los lunes")

estrenos = Estrenos("Nuevos episodios cada semana")

estrenos.agregarSerie(s1)
estrenos.agregarSerie(s2)
estrenos.agregarSerie(s3)

estrenos.imprimir()