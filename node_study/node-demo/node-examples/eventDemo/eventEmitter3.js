var Greeter = require('./Greeter')

var greeterDemo = new Greeter()
greeterDemo.on('greet', function(data) {
    console.log('this is it ', data)
}) 
greeterDemo.greet('Ritesh')