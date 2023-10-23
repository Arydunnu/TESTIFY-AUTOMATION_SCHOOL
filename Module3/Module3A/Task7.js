const side1 = 4
const side2 = 2
const side3 = 5

if(side1 === side2 && side2 === side3) {
    console.log("Equilateral triangle")

} else if (side1 === side2 || side1 === side3 || side2 === side3) {

    console.log("Isosceles triangle")

} else {
    console.log ("Scalene triangle")
}
