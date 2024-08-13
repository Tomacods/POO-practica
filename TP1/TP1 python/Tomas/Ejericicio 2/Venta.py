from Producto import Producto
from Ticket import Ticket

p1 = Producto("Adermicina",30, "mg", 500)
p2 = Producto("Ibuprofeno",600,"mg", 100)
p3 = Producto("Diclofenac",75,"mg" , 200)
p4 = Producto("Ibuprofeno",600,"mg", 100)
p5 = Producto("Diclofenac",75,"mg" , 200)



ticket = Ticket(64437)

ticket.agregarProducto(p1)
ticket.agregarProducto(p2)
ticket.agregarProducto(p3)
ticket.agregarProducto(p4)
ticket.agregarProducto(p5)



ticket.imprimir()


