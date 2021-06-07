var eventEmiiter = require('events');
var util = require('util');

function Greeter () {
    this.hello = 'Hello World!.'
}

util.inherits(Greeter, eventEmiiter)
Greeter.prototype.greet = function(data) {
    console.log(`Hey ${this.hello}`)
    this.emit('greet', data)
}

var greeterDemo = new Greeter()
greeterDemo.on('greet', function(data) {
    console.log('this is it ', data)
}) 
greeterDemo.greet('Ritesh')