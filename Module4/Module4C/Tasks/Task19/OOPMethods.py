class Human:
    def __init__(self, name, age, gender):
        self.name = name
        self.age = age
        self.gender = gender
        self.leg_count = 4
        self.can_walk = True

    def get_description(self):
        print("This is human")

    def get_leg_count(self):
        return self.leg_count

# Example of creating an instance of the Human class
humanBeing= Human("Aridunnu", 30, "Female")

# Invoking methods
humanBeing.get_description()  # Output: This is human
print("Leg count:", humanBeing.get_leg_count())  # Output: Leg count: 4
