
/**
 * var is partially hoisted so it will be allocated memory and initilize by undefined.
 * function will fully hoisted.
 * let and const is hoisted but not initalized so throws refernce is not defined error.
 * its better to not use hoisting to avoid memory leak
 * 
 */
console.log('1.....');
console.log('before..' + a); // undefined
// console.log(d) // d is not defined
var a = 'test';
let d = 'test5';
console.log('after..' + a); // test
console.log(d)
show(); //Hoisting demo
function show() {
    console.log('Hoisting demo');
}
show(); // //Hoisting demo
//console.log('before..' + c); // ReferenceError: c is not defined
let c = 'test1';
console.log('before..' + c);

let yes = 'no'
if(true) {
    const test11 = 'yes';
    console.log(test11)
    let test12 = 'No'
    console.log(test12)
    yes = 'yes'
}
console.log(yes)
// blocked scope
// console.log(test11)
// console.log(test12)

