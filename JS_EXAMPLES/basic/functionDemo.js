function test(name, roll) {
    console.log("name " + name +" roll "+roll)
}

test("Ritesh", 01) // name Ritesh roll 1
test("Ritesh") // name Ritesh roll undefined
test("Ritesh", 01, "Test") // name Ritesh roll 1

// Function Expression

var f = function foo(name) {
    console.log("name is : "+name)
};

var executor = function (fn, name) {
    fn(name)
};

executor(f, "Test")// name is : Test

var testObj = {
    name : "Ritesh"
}

testObj.demo = function() {
    console.log("function inside object")
}

console.log(testObj) // { name: 'Ritesh', demo: [Function] }
console.log(testObj.demo()) // function inside object