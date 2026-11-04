username = input("Enter your username: ")
password = input("Enter your password: ")

lowercase_username = username.lower()
lowercase_password = password.lower()

if lowercase_username == "admin" and lowercase_password == "python123":
    print("Login successful")
else:
    print("Invalid credentials")
