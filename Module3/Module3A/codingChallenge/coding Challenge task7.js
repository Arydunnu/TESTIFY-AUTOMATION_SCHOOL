
// Example array of numbers
const arrayOfNumbers = [5, 2, 8, 1, 4];

// Use the sort method with a custom comparison function to sort the array in descending order
arrayOfNumbers.sort(function(a, b) {
    // Compare b and a to sort in descending order
    return b - a;
});

// Print the sorted array
console.log(arrayOfNumbers);
