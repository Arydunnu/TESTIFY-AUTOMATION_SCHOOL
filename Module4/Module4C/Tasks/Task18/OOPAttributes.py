class Human:
    def __init__(self, name, age, gender):
        self.name = name
        self.age = age
        self.gender = gender
        self.leg_count = 4
        self.can_walk = True

# Example of creating an instance of the Human class
humanBeing = Human("Aridunnu", 30, "Female")
print("Name:", humanBeing.name)
print("Age:", humanBeing.age)
print("Gender:", humanBeing.gender)
print("Leg count:", humanBeing.leg_count)
print("Can walk?", humanBeing.can_walk)
