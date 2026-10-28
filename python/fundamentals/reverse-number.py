"""Reverse an integer while preserving its sign."""


def reverse_integer(num: int) -> int:
    is_negative = num < 0
    num = abs(num)
    reverse = 0

    while num > 0:
        digit = num % 10
        reverse = reverse * 10 + digit
        num = num // 10

    return -reverse if is_negative else reverse


def main() -> None:
    num = int(input("Enter a number: "))
    print(reverse_integer(num))


if __name__ == "__main__":
    main()
