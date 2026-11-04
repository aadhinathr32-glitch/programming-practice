l1 = int(input("Enter side length 1: "))
l2 = int(input("Enter side length 2: "))
l3 = int(input("Enter side length 3: "))

if (
    l1 > 0
    and l2 > 0
    and l3 > 0
    and l1 + l2 > l3
    and l2 + l3 > l1
    and l1 + l3 > l2
):
    print("Valid triangle")
else:
    print("Invalid triangle")
