n = int(input("Enter the number of digits to be compared : "))
nums = list(map(int, input("Enter the digits : ").split()))

total = 0

for i in range(1, n):
    if nums[i] <= nums[i - 1]:
        new_value = nums[i - 1] + 1
        total += new_value - nums[i]
        nums[i] = new_value

print(total)
