"""Validate a withdrawal amount and its denomination."""


def main() -> None:
    account_balance = int(input("Enter account balance: "))
    withdrawal_amount = int(input("Enter withdrawal amount: "))

    if withdrawal_amount <= 0:
        print("Transaction rejected")
    else:
        if account_balance >= withdrawal_amount:
            if withdrawal_amount % 100 == 0:
                print("Withdrawal successful")
            else:
                print("Withdrawal failed")
        else:
            print("Insufficient balance")


if __name__ == "__main__":
    main()
