consumption = int(input("Enter your electricity consumption: "))

if consumption < 0:
    print("Invalid")
elif 0 <= consumption <= 100:
    print("Low consumption")
elif 101 <= consumption <= 300:
    print("Medium consumption")
else:
    print("High consumption")
