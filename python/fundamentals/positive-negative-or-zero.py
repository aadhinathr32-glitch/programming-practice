"""Determine whether an integer is positive, negative, or zero."""


def main() -> None:
    num = int(input("Enter the number: "))

    if num > 0:
        print("Positive number")
    elif num == 0:
        print("Zero")
    else:
        print("Negative number")


if __name__ == "__main__":
    main()
