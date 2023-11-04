const books={

    title: "How to create value" ,

    description: "This book is all about investing in yourself " ,

    numberOfPages: 20 ,

    author: "Aridunnu" , 

    reading : true ,

    toggleReadingStatus : function(){
        if(books.reading===false){
            books.reading= true

        } else{
            books.reading=false
        }

}

}
    books.toggleReadingStatus()
    console.log (books.reading)