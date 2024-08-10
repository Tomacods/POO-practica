from Producto import Producto
from Ticket import Ticket

p1 = Producto("Adermicina",30,"mg",1000.0)
p2 = Producto("Ibuprofeno",600,"mg",2500.0)
p3 = Producto("Diclofenac",75,"mg",3500.0)

ticket = Ticket(64437)

ticket.agregarProducto(p1)
ticket.agregarProducto(p2)
ticket.agregarProducto(p3)

ticket.imprimir()