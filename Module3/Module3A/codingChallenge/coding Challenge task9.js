
function numberOfVowels(vowels) {
    // Convert the string to lowercase to make the count case-insensitive

    const lowercaseStr = vowels.toLowerCase();
    
    // Define a regular expression to match vowels
    const vowelTypes = /[aeiou]/g;

    // Use match method to find all matches of vowels in the string
    const matches = lowercaseStr.match(vowelTypes);

    // Return the count of matches (number of vowels)
    return matches ? matches.length : 0;
}


const myString = "I want to be great!";
console.log(countVowels(myString));  
