
function isDivisibleBy10(number) {
    // Check if the number is divisible by 10
    return number % 10 === 0;
}

// Example usage:
console.log(isDivisibleBy10(20));   // Output: true
console.log(isDivisibleBy10(15));   // Output: false
console.log(isDivisibleBy10(100));  // Output: true
console.log(isDivisibleBy10(7));    // Output: false
