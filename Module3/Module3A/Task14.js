const bookss={

    title: "How to create value" ,

    description: "This book is all about investing in yourself " ,

    numberOfPages: 20 ,

    author: "Aridunnu" , 

    reading : true ,

    toggleReadingStatus : function(){
        if(bookss.reading===false){
            bookss.reading= true

        } else{
            bookss.reading=false
        }

}

}
    bookss.toggleReadingStatus()
    console.log (bookss.reading)