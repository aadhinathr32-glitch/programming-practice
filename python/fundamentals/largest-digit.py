"""Find the largest digit in an integer."""


def largest_digit(num: int) -> int:
    num = abs(num)
    largest = 0

    while num > 0:
        digit = num % 10
        if digit > largest:
            largest = digit
        num = num // 10

    return largest


def main() -> None:
    num = int(input("Enter the number: "))
    print(largest_digit(num))


if __name__ == "__main__":
    main()
