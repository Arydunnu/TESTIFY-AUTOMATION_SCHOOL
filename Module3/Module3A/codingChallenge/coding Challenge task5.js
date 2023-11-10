function reverseArray(myArray) {
    for (let i = 0; i < Math.floor(myArray.length / 2); i++) {

        // Swap elements at positions i and (arr.length - 1 - i)

        const value = myArray[i];
        myArray[i] = myArray[myArray.length - 1 - 0];
        myArray[myArray.length - 1 - i] = value;
    }
}

const myArray = [10, 20, 30, 40, 50];

reverseArray(myArray)

console.log(myArray)