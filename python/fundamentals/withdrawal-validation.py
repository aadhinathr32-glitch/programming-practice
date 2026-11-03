"""Validate a withdrawal against the account balance."""


def main() -> None:
    account_balance = int(input("Enter account balance: "))
    withdrawal_amount = int(input("Enter withdrawal amount: "))

    if withdrawal_amount <= 0:
        print("Transaction rejected")
    else:
        if withdrawal_amount <= account_balance:
            print("Withdrawal successful")
        else:
            print("Insufficient balance")


if __name__ == "__main__":
    main()
