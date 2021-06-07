var a = new Number(5);
console.log(typeof a) // object

var b = 5
console.log(typeof b) // number

console.log(a===b) // false
console.log(a==b) // true - type change

// object methods are available since b is wrapped internally as object
console.log(b.toString())