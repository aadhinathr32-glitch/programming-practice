number = int(input("Enter a number: "))
num = abs(number)
original = num
sum = 0

while num > 0:
    digit = num % 10
    factorial = 1

    for i in range(1, digit + 1):
        factorial = factorial * i

    sum = sum + factorial
    num = num // 10

if sum == original:
    print("Strong number")
else:
    print("Not a strong number")
