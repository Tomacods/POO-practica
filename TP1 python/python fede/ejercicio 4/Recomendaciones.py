from Curso import Curso
from Lista import Lista

c1 = Curso("imagen", "PyTorch Deep Learning Bootcamp", "Andrei Neagoie, Daniel Bourke", 4.6, "4.5/5", 2907, 12.99, 74.99, "Bestseller")
c2 = Curso("imagen", "Machine Learning A-Z: AI, Python & R + ChatGPT Prize...", "Kirill Eremenko, Hadelin de Ponteves,...", 4.5, "4.5/5", 184477, 14.99, 84.99, "Bestseller")
c3 = Curso("imagen", "Deep Learning: Advanced Computer Vision (GANs, SSD,...)", "Lazy Programmer Inc.", 4.6, "4.5/5", 6157, 14.99, 79.99, "-")
c4 = Curso("imagen", "Applied Generative AI and Natural Language Processing", "Bert Gollnick", 4.7, "4.5/5", 66, 12.99, 54.99, "Hot & new")

lista = Lista()

lista.agregarCurso(c1)
lista.agregarCurso(c2)
lista.agregarCurso(c3)
lista.agregarCurso(c4)

lista.imprimirCursos()