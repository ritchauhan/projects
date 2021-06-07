// you can assign a function to a variable
var test = function() {
    console.log('test function')
}

test()

// you can pass function as a argument
function test2(fn) {
    fn()
}

test2(function() {
    console.log('test2 function')
})

// you can return function
function test3() {
    return function () {
        console.log('test3 function')
    }
}

var test4 = test3()
test4()
