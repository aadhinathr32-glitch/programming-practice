"""Check whether an integer is even or odd."""


def main() -> None:
    num = int(input("Enter a number: "))

    if num % 2 == 0:
        print("The given number is even")
    else:
        print("The given number is odd")


if __name__ == "__main__":
    main()
