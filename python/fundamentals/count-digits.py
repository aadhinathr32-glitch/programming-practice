"""Count the digits in an integer."""


def count_digits(num: int) -> int:
    num = abs(num)

    if num == 0:
        return 1

    count = 0
    while num > 0:
        count = count + 1
        num = num // 10

    return count


def main() -> None:
    num = int(input("Enter a number: "))
    print(f"Count = {count_digits(num)}")


if __name__ == "__main__":
    main()
