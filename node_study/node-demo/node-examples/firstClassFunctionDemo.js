
// Normal Function
function greet() {
    console.log('Hello')
}

greet()

// First Class function
function logGreet(fn) {
    fn()
}

logGreet(greet)

// Function Expresions

var result = function () {
   console.log('Enjoy')
}

result()

logGreet(result)

// Function on the fly

logGreet(function() {
    console.log('Hi')
});
