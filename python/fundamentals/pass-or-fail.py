"""Determine pass or fail based on three subject marks."""


def main() -> None:
    sub1 = int(input("Enter subject 1 marks: "))
    sub2 = int(input("Enter subject 2 marks: "))
    sub3 = int(input("Enter subject 3 marks: "))

    if sub1 >= 40 and sub2 >= 40 and sub3 >= 40:
        print("Pass")
    else:
        print("Fail")


if __name__ == "__main__":
    main()
