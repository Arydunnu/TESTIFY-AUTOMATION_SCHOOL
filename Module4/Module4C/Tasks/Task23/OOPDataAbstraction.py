class User:
    def __init__(self):
        self.__password = "password"  # Private attribute

    def get_password(self):
        return self.__password  # Method to get the password

class ActiveUser(User):
    def get_password(self):
        return "********"  # Overriding the get_password method for ActiveUser

# Instantiate the ActiveUser class
active_user = ActiveUser()

# Print the value of get_password() from the object instance
print("Password:", active_user.get_password())  # Output: Password: ********
