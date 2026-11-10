num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))

num1 = abs(num1)
num2 = abs(num2)

if num1 == 0 or num2 == 0:
    print("LCM: 0")
else:
    a = num1
    b = num2

    while b != 0:
        remainder = a % b
        a = b
        b = remainder

    gcd = a
    lcm = (num1 * num2) // gcd

    print("LCM:", lcm)
