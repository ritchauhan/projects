/**
 * Don't prefer to use arguments
 * arguments returns objects and if no arguments is passed then it will be empty.
 */
function india() {
    console.log('its warm');
}

var canada = () => console.log('Its cold')

india()
canada()

function marry(person1, person2) {
    console.log(Array.from(arguments)) // ['Tom', 'Tina] - array
    console.log(person1, 'marries', person2);
}

function marry1(...args) {
    console.log(arguments) // {'Tom', 'Tina'} - object
    console.log(args[0], 'marries', args[1]);
}

marry('Tom', 'Tina')
marry1('Tom', 'Tina')