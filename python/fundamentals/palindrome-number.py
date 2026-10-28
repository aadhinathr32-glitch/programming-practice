"""Check whether a non-negative integer is a palindrome."""


def is_palindrome(num: int) -> bool:
    if num < 0:
        return False

    original = num
    reverse = 0

    while num > 0:
        digit = num % 10
        reverse = reverse * 10 + digit
        num = num // 10

    return original == reverse


def main() -> None:
    num = int(input("Enter a number: "))
    if is_palindrome(num):
        print("palindrome")
    else:
        print("not palindrome")


if __name__ == "__main__":
    main()
