"""Count the digits in an integer using abs()."""


def count_digits(num: int) -> int:
    count = 0
    num = abs(num)

    if num == 0:
        return 1

    while num > 0:
        count = count + 1
        num = num // 10

    return count


def main() -> None:
    num = int(input("Enter a number: "))
    print(f"Count is {count_digits(num)}")


if __name__ == "__main__":
    main()
