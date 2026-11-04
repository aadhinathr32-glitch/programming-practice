age = int(input("Enter your age: "))
consumption = float(input("Enter your monthly electricity consumption in units: "))
customer = input("Are you a senior citizen (yes/no): ")

lowercase_customer = customer.lower()

if consumption < 0:
    print("Invalid consumption")
elif consumption > 500:
    print("High consumption")
elif lowercase_customer == "yes" or age < 18:
    print("Special category")
else:
    print("Regular customer")
