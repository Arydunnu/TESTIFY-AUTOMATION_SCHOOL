class Human:
    def __init__(self):
        self.leg_count = 4

    def get_gender(self):
        return "Unknown"

class Man(Human):
    pass

class Woman(Human):
    pass

# Instantiate Man and Woman classes
male = Man()
Female = Woman()

# Print the gender of each instance
print("Man's gender:", male.get_gender())  # Output: Man's gender: Unknown
print("Woman's gender:", Female.get_gender())  # Output: Woman's gender: Unknown
