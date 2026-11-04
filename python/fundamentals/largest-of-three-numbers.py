"""Find the largest among three numbers."""


def main() -> None:
    n1 = int(input("Enter first number: "))
    n2 = int(input("Enter second number: "))
    n3 = int(input("Enter third number: "))

    if (n1 >= n2) and (n1 >= n3):
        print("First number is the largest")
    elif (n2 >= n1) and (n2 >= n3):
        print("Second number is the largest")
    else:
        print("Third number is the largest")


if __name__ == "__main__":
    main()
