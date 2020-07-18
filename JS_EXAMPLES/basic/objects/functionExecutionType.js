// Method 1

function foo () {
    console.log('Hello1')
}

foo() // Hello

// Method 2

var foo = function() {
    console.log('Hello2')
}

foo() // Hello

// Method 3

var obj = {}
obj.foo = function () {
    console.log('Hello3')
}

obj.foo() // Hello
new foo() // Hello