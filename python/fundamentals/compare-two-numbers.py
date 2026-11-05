n1 = int(input("Enter number 1: "))
n2 = int(input("Enter number 2: "))

if n1 == n2:
    print("Both are equal")
else:
    print("Number 1 is the largest") if n1 > n2 else print("Number 2 is the largest")
