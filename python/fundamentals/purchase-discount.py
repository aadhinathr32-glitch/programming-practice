amount = int(input("Enter purchase amount: "))
customer_type = input("Enter customer type: ")
customer_type = customer_type.lower()

if amount < 0:
    print("Invalid amount")
elif amount == 0:
    print("No purchase")
else:
    discount = 0

    if customer_type == "regular":
        discount = 5
    elif customer_type == "premium":
        discount = 10
    elif customer_type == "vip":
        discount = 20
    else:
        print("Invalid input")

    if discount != 0:
        discount_amount = amount * discount / 100
        final_amount = amount - discount_amount

        print("Discount:", discount, "%")
        print("Discount amount:", discount_amount)
        print("Final amount:", final_amount)
