'use strict'
function weird() {
    // height = 50;
    let height = 50;
    return height;
}

console.log(weird())

var test = function doodle() {
    console.log('test function')
    // doodle() // this works here since this is the doodle execution scope
}

test()
doodle() // doodle is not defined