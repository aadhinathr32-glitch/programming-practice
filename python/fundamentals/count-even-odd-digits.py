"""Count even and odd digits in an integer."""


def count_even_odd_digits(num: int) -> tuple[int, int]:
    num = abs(num)
    even_count = 0
    odd_count = 0

    if num == 0:
        even_count += 1
    else:
        while num > 0:
            digit = num % 10
            if digit % 2 == 0:
                even_count += 1
            else:
                odd_count += 1
            num = num // 10

    return even_count, odd_count


def main() -> None:
    num = int(input("Enter a number: "))
    even_count, odd_count = count_even_odd_digits(num)
    print(f"The count of even numbers are: {even_count}")
    print(f"The count of odd numbers are: {odd_count}")


if __name__ == "__main__":
    main()
