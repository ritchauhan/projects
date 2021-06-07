function two() {
    // var isValid;
    console.log('inside two', isValid)
}

function one() {
    var isValid = true;
    two();
    console.log('inside ',isValid)
}

console.log('isValid', isValid)
var isValid = false;

one();

console.log('global ', isValid)