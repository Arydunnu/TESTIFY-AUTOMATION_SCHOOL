class Hunt:
    def __init__(self):
        self.__weapon = "Assault Rifle"  # Private attribute

    def get_weapon(self):
        return "Not Available"  # Method to get the weapon, returning "Not Available"

# Instantiate the Hunt class
hunt_instance = Hunt()

# Print the value of get_weapon() from the object instance
print("Weapon:", hunt_instance.get_weapon())  # Output: Weapon: Not Available
