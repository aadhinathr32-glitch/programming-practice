"""Determine acceptance using an OR condition."""


def main() -> None:
    num1 = int(input("Enter number 1: "))
    num2 = int(input("Enter number 2: "))

    if num1 > 100 or num2 < 50:
        print("Accepted")
    else:
        print("Rejected")


if __name__ == "__main__":
    main()
