
// Create a function that filters out negative numbers.

function filterNegativeNumbers(numbers) {

    const positiveNumbers = numbers.filter(function(number) {
        return number >= 0;
    });

    return positiveNumbers;
}


const myNumbers = [3, -1, 0, -3, 2,-5 ,6 ,-7, 12];

const result = filterNegativeNumbers(myNumbers);
console.log(result);
