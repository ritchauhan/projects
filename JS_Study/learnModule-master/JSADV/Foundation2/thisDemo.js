function whichName() {
    console.log(this)
}

var obj1 = {
    a: 'test',
    whichName
}

var obj2 = {
    b: 'test2',
    whichName
}

// this is left side of the dot
// obj1.whichName() // obj1
// obj2.whichName() // obj2

// Four implementation of this
// 1. through new keyword

function person(name, age) {
    this.name = name;
    this.age = age;
    console.log(this)
}

var person = new person('Ritesh', 32)

// 2. implicit binding
var person1 = {
    a: 'test1',
    hi: function() {
        console.log(this)
    }
}

person1.hi()

// 3. explicit bindings

let name = 'chauhan'

var person2 = {
    name: 'rit',
    hi: function() {
        console.log(this.name)
    }.bind(global)
}

person2.hi()

// 4. curly braces

var person3 = {
    c: 'test3',
    hi: function() {
        var inner = () => {
            console.log(this)
        }
        return inner()
    }
}

person3.hi()