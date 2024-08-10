import random
num = int(input("Ingrese el primer numero "))
num2 = random.randint(1,10)
if (num != num2): 
    print(num," Es distinto a ", num2)
else: print(num," Es igual a ",num2)
if (num == num2):
    print(num," Es igual a ",num2)
elif (num < num2):
        print(num," Es menor a ", num2)
else: print(num," Es mayor a ",num2)
if (num <= num2): 
    print(num," Es menor o igual a ", num2)
else: print(num," Es mayor o igual a ",num2)

