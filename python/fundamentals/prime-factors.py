number = int(input("Enter a number: "))

num = abs(number)

if num <= 1:
    print("No prime factors")
else:
    factor = 2

    while factor <= num:
        if num % factor == 0:
            print(factor, end=" ")
            while num % factor == 0:
                num = num // factor
        factor += 1

    print()
