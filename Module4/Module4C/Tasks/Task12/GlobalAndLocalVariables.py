# Declare a global variable named 'language' with the value "Python"
language = "Python"


# Create a function
def print_language():
    # Declare a local variable named 'language' with the value "Java"
    language = "Java"

    # Print out the local variable
    print("Inside function:", language)


# Print out the global variable
print("Outside function:", language)

# Invoke the function
print_language()
