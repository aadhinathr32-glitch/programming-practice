n = int(input("Enter the number of elements : "))
nums = list(map(int, input("Enter the numbers : ").split()))
target = int(input("Enter the target number : "))

seen = set()

for x in nums:
    needed = target - x

    if needed in seen:
        print(needed, x)
        break

    seen.add(x)
