var rect = require('./rect.js')
var rectangle = require('./rectangle.js')

function solveRect(l,b) {
    console.log("length : "+l + " breadth : "+b);
    console.log("perimeter is :"+rect.perimeter(l,b) 
    + " area is :"+rect.area(l,b));   
}

// function solveRectangle(l,b, (err, rectangle) => {
//     console.log("length : "+l + " breadth : "+b);
//     console.log("perimeter is :"+rectangle.perimeter
//     + " area is :"+rectangle.area); 
//     })

// //solveRect(1,5)
// //solveRect(10,20)

// solveRectangle(1, 0)
// solveRectangle(10, 20)

