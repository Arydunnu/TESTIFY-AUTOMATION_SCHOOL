class Arithmetic:
    @staticmethod
    def print_name(addition):
        print(addition)

# Invoke the static method
Arithmetic.print_name("20 + 20 =  40" )

class Utilities:
    def print_name(name):
        print(name)
    print_name = staticmethod(print_name)  # Define print_name as a static method

# Invoke the static method
Utilities.print_name("Aridunnu ")

