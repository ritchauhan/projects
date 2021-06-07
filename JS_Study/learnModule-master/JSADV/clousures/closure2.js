/**
 * it doesn't matter where you have varibale in the scope
 * it will be accessed from closure
 */
function callmeApply() {
    // const callme = 'Hi please call me!'
    setTimeout(function() {
        console.log(callme) // Hi please call me!
    }, 4000)
    const callme = 'Hi please call me!'
}

callmeApply()