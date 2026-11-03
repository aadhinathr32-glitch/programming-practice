"""Check eligibility using age, degree, and experience."""


def main() -> None:
    age = int(input("Enter your age: "))
    degree = input("Do you have a degree? (yes/no) ")
    degree_lower = degree.lower()
    experience = int(input("Enter experience: "))

    if ((age >= 21) and (degree_lower == "yes")) or (experience >= 3):
        print("Eligible")
    else:
        print("Not eligible")


if __name__ == "__main__":
    main()
