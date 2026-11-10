num = int(input("Enter the number of terms: "))

first = 0
second = 1

if num <= 0:
    print("Enter a positive number of terms")
else:
    for i in range(num):
        print(first, end=" ")
        next_number = first + second
        first = second
        second = next_number

    print()
