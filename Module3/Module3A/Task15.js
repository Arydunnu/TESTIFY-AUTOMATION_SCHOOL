const myBooks = [{

    title:"My Story Book",

    description: "The Lion and the Cat",

    numberOfPages:"50",

    authour: "Mr Dee", 

    reading: true,
},
{
    title:"My First Story Book",

    description: "The Lion and the Cat",

    numberOfPages:"50",

    authour: "Mr Dee", 

    reading: false,
},
{
    title:"My Second Story Book ",

    description: "The Lion and the rat",

    numberOfPages:"510",

    authour: "Mr Taylor", 

    reading: true,
},
{
    title:"My Third Story Book",

    description: "The Lion and the goat",

    numberOfPages:"550",

    authour: "Mr Tape ", 

    reading: false,
},


];

for (let i= 0; i <= 3; i= i+1) {
    
    if(myBooks[i].reading === true)
    {
        console.log("Title: " + myBooks[i].title);
        console.log("Description: " + myBooks[i].description);
        console.log("Number of Pages: " + myBooks[i].numberOfPages);
        console.log("Author: " + myBooks[i].authour);
        console.log("Reading: " + myBooks[i].reading);
}
}