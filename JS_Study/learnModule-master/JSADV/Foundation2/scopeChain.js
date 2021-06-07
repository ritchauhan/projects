/**
 * c is not printed since it doesn't found in scope chain.
 * c was defined in local scope which was not found by sayMyName.
 * @returns 
 */

function sayMyName() {
    var a = 'a';
    // console.log(c); // c is not defined
    return function findMyName() {
        var b = 'b';
        return function printName() {
            var c = 'c';
            console.log(a); // a
            console.log(d); // undefined
            console.log(e); // e
            return 'Ritesh KUmar';
        }
    }
}
var e = 'e'
console.log(sayMyName()()()); // Ritesh Kumar
var d = 'd' 