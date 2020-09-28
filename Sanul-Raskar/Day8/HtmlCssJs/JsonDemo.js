var json = `{
    "book": {
        "name": "Harry Potter and the Goblet of Fire",
        "author": "J. K. Rowling",
        "year": 2000,
        "characters": ["Harry Potter", "Hermione Granger", "Ron Weasley"],
        "genre": "Fantasy Fiction",
        "price": {
            "paperback": "$10.40", "hardcover": "$20.32", "kindle": "$4.11"
        }
    }
}`;

// Converting JSON object to JS object
var obj = JSON.parse(json);

// Define recursive function to print nested values
function printValues(obj) {
    for(var k in obj) {
        if(obj[k] instanceof Object) {
            printValues(obj[k]);
        } else {
            document.write(obj[k] + "<br>");
        };
    }
};

// Printing all the values from the resulting object
printValues(obj);

document.write("<hr>");

// Printing a single value
document.write(obj["book"]["author"] + "<br>");  
document.write(obj["book"]["characters"][0] + "<br>");  
document.write(obj["book"]["price"]["hardcover"]);   
