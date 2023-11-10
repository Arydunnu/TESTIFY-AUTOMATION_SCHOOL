
const arrayOfStrings = ['Nigeria', 'Canada', 'Australia', 'London'];

arrayOfStrings.sort(function (a, b) {
    return a.toLowerCase().localeCompare(b.toLowerCase());
});

console.log(arrayOfStrings);
