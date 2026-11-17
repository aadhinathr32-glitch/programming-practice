number = int(input("Enter a decimal number: "))

if number < 0:
    print("Enter a non-negative number")
elif number == 0:
    print("Binary: 0")
else:
    num = number
    binary = ""

    while num > 0:
        remainder = num % 2
        binary = str(remainder) + binary
        num = num // 2

    print("Binary:", binary)
