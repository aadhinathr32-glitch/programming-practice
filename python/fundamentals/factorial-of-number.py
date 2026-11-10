num = int(input("Enter your number: "))

factorial = 1

if num < 0:
    print("Factorial is not defined for negative numbers")
else:
    for i in range(1, num + 1):
        factorial = factorial * i

    print("Factorial:", factorial)
