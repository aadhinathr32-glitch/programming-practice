"""Check eligibility using combined AND and OR conditions."""


def main() -> None:
    age = int(input("Enter age: "))
    degree = input("Do you have a degree? ").strip().lower()
    experience = int(input("Enter experience: "))

    if (age >= 21 and degree == "yes") or experience >= 3:
        print("Eligible")
    else:
        print("Not eligible")


if __name__ == "__main__":
    main()
