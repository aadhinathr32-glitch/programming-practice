"""Calculate the sum of the digits in an integer."""


def sum_of_digits(num: int) -> int:
    num = abs(num)
    total = 0

    while num > 0:
        digit = num % 10
        total = total + digit
        num = num // 10

    return total


def main() -> None:
    num = int(input("Enter a number: "))
    print(sum_of_digits(num))


if __name__ == "__main__":
    main()
