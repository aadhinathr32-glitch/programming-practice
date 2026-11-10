num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))

num1 = abs(num1)
num2 = abs(num2)

while num2 != 0:
    remainder = num1 % num2
    num1 = num2
    num2 = remainder

print("GCD:", num1)
