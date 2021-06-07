// pass by value
// primitive types are pass by value and creates different address in memory

let a = 10
let b = a
b++

console.log(a) // 10
console.log(b) // 11

// pass by reference
// non primitives are pass by reference and points to same address in memory
let test = {
    user: 'admin',
    pass: 'password',
    obj: {
        text: 'hey'
    }
}

let test1 = test
test1.pass = 'password1'

console.log(test.pass) // password1
console.log(test1.pass) // password1

// to avoid pass by reference we can use shallow copy or deep copy

let clone = Object.assign({}, test)
let clone1 = {...test}

test.pass = 'shallow'
console.log(clone.pass) // password1
console.log(clone1.pass) // password1

console.log(test1.pass) // shallow

// deep copy
// problem with shallow copy, internal object is pass by reference
test.obj.text = 'hi'
console.log(clone.obj.text) // hi
console.log(clone.obj.text) // hi

let superclone = JSON.parse(JSON.stringify(test)) // deep copy even internal object will be not referenced
test.obj.text = 'hi how are you !'

console.log(clone.obj.text) // hi how are you !
console.log(superclone.obj.text) // hi 