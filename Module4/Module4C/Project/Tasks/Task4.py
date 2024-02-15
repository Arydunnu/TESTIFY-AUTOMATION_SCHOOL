def print_multiplication_table(n):
    for i in range(1, n+1):
        for j in range(1, n+1):
            print(f"{i} * {j} = {i*j}")
        print()  # Print an empty line after each row

# Example: Printing multiplication table up to 10
print_multiplication_table(10)
