salary = int(input("Enter your salary: "))
experience = int(input("Enter your experience: "))

if salary < 0 or experience < 0:
    print("Invalid input")
elif experience >= 5:
    if salary >= 50000:
        bonus_percentage = 20
    else:
        bonus_percentage = 10

    bonus_amount = salary * bonus_percentage / 100
    print(bonus_percentage)
    print(bonus_amount)
else:
    if salary >= 50000:
        bonus_percentage = 10
    else:
        bonus_percentage = 5

    bonus_amount = salary * bonus_percentage / 100
    print(bonus_percentage)
    print(bonus_amount)
