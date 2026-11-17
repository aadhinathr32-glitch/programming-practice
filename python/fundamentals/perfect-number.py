number = int(input("Enter a number: "))

if number <= 0:
    print("Invalid number")
else:
    sum = 0

    for i in range(1, number):
        if number % i == 0:
            sum = sum + i

    if sum == number:
        print("Perfect number")
    else:
        print("Not a perfect number")
