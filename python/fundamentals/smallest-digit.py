"""Find the smallest digit in an integer."""


def smallest_digit(num: int) -> int:
    num = abs(num)

    if num == 0:
        return 0

    smallest = num % 10
    while num > 0:
        digit = num % 10
        if digit <= smallest:
            smallest = digit
        num = num // 10

    return smallest


def main() -> None:
    num = int(input("Enter the number: "))
    print(smallest_digit(num))


if __name__ == "__main__":
    main()
