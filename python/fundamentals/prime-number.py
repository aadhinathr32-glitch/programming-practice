"""Check whether an integer is prime."""


def is_prime(num: int) -> bool:
    if num <= 1:
        return False

    i = 2
    while i < num:
        if num % i == 0:
            return False
        i = i + 1

    return True


def main() -> None:
    num = int(input("Enter a number: "))

    if is_prime(num):
        print("Prime")
    else:
        print("Not prime")


if __name__ == "__main__":
    main()
