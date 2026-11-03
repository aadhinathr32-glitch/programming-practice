"""Determine whether an integer is positive, negative, or zero."""


def main() -> None:
    num = int(input("Enter a number: "))

    if num == 0:
        print("Zero")
    else:
        result = "Positive" if num > 0 else "negative"
        print(result)


if __name__ == "__main__":
    main()
