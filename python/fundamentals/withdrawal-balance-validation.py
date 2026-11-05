account_balance = int(input("Enter your current account balance: "))
withdrawal_amount = int(input("Enter withdrawal amount: "))

if account_balance < 0:
    print("Invalid balance")
elif withdrawal_amount < 0:
    print("Invalid withdrawal")
elif withdrawal_amount == 0:
    print("No withdrawal")
else:
    if withdrawal_amount > account_balance:
        print("Insufficient balance")
    else:
        balance = account_balance - withdrawal_amount
        print("Withdrawal amount:", withdrawal_amount)
        print("Remaining balance:", balance)
