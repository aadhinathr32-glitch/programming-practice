num = int(input("Enter your number: "))

sum = 0

for i in range(2, num + 1, 2):
    sum = sum + i

print("Sum of even numbers:", sum)
