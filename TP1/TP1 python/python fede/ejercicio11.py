import random

rta = True
num1 = random.randint(1,10)
num2 = random.randint(1,10)

while rta==True:
    while num1==num2:
        num1 = random.randint(1,10)
        num2 = random.randint(1,10)
    print("Valor 1:", num1)
    print("Valor 2:", num2)
    ap = int(input("Desea apostar por el valor 1 o por el valor 2?: "))
    while ap != 1 and ap != 2:
        ap = int(input("Error! Ingrese un valor correcto (1/2):"))
    if (ap==1):
        if (num1>num2):
            print("Has ganado!")
        else:
            print("Has perdido!")
    else:
        if (num1>num2):
            print("Has perdido!")
        else:
            print("Has ganado!")
    resp = input("Desea jugar otra vez? (s/n): ")
    while (resp != "s") and (resp != "n"):
        resp = input("Error! Ingrese una respuesta correcta (s/n): ")
    if resp == "s":
        rta = True
    else:
        rta = False
print("Gracias por jugar!")