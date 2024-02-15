from abc import ABC, abstractmethod

class Vehicle(ABC):
    @abstractmethod
    def drive_direction(self):
        pass

class Car(Vehicle):
    def drive_direction(self):
        print("Drive forward")

class Plane(Vehicle):
    def drive_direction(self):
        print("Drive Upward")

# Instantiate Car and Plane classes
car = Car()
plane = Plane()

# Invoke the drive_direction() method for each object instance
car.drive_direction()  # Output: Drive forward
plane.drive_direction()  # Output: Drive Upward
