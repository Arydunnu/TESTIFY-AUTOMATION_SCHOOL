class Human:
    def __init__(self):
        self.leg_count = 4

    def get_gender(self):
        return "Unknown"

class Man(Human):
    def get_gender(self):
        return "man"

class Woman(Human):
    def get_gender(self):
        return "woman"

# Instantiate Man and Woman classes
man = Man()
woman = Woman()

# Print the gender of each instance
print("Man's gender:", man.get_gender())  # Output: Man's gender: man
print("Woman's gender:", woman.get_gender())  # Output: Woman's gender: woman
