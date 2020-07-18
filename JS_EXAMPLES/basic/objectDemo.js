var myObj = {} // empty object

console.log(myObj) // {}

myObj.prop = "test obj"
myObj.prop2 = 123
myObj.name = "demo object"

console.log(myObj) // { prop: 'test obj', prop2: 123, name: 'demo object' }
console.log(myObj.name) // demo object
console.log(myObj.prop2) // 123

//Object Literals:

var myObjLiterals = {
    "name" : "Ritesh",
     roll: 123
}

console.log(myObjLiterals) // { name: 'Ritesh', roll: 123 }
console.log(myObjLiterals["roll"]) // 123
// If you try to access property which is not defined then will get undefined
console.log(myObjLiterals.address) // undefined

// Dot and [] backet notation
var testObj = {
    name : "Ritesh",
    prop : "test1",
    prop2 : "test2",
    1 : "one"
}

//console.log(testObj.1) // error SyntaxError: missing ) after argument list
console.log(testObj["1"]) // one
var propertyName = "prop" 
console.log(testObj[propertyName]) //test1

// Nested Objest

var tObj = {
    name : "Ritesh",
    prop : "test1",
    prop2 : "test2",
    innerObj : {
        address : "Bangalore",
        phone: "1232434545"
    },
    1 : "one"
}

console.log(tObj) 
console.log(tObj.innerObj.address) // Bangalore
console.log(tObj.innerObj["phone"]) // 1232434545

// === in objects

var test1 = {
    demo : "Hello"
}

var test2;

test2 = test1;

if(test1 === test2) {
    console.log("variables are equal") //variables are equal
}

var test3 = {
    demo : "Hello",
    demo1 : null
}

// This condition will be false since both the objects are pointing to two different location
if(test1 === test3) {
    console.log("variables are equal") 
}

// null and undefined on Objects
console.log(test3.age) // undefined
console.log(test3.demo1) // null

// Delete property on object

var test4 = {
    demo : "Hello",
    age: 25
}

test4.age = undefined
console.log(test4.age) // undefined
console.log(test4) // { demo: 'Hello', age: undefined }

delete test4.age
console.log(test4.age) // undefined
console.log(test4) // { demo: 'Hello' }