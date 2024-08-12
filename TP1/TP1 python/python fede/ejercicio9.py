import random

num1 = int(input("Ingrese un número: "))
num2 = random.randint(1, 10)

if (num1==num2):
    print(num1, "es igual a", num2)
else:
    if (num1>num2):
        print(num1, "es mayor a", num2)
    else: print(num1, "es menor a", num2)