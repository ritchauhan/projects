var Emitter = require('events')
var eventConfig = require('./eventConfig').events

var emtr = new Emitter()

emtr.on(eventConfig.HELLO, function() {
    console.log('Hello There !!.')
})

emtr.on(eventConfig.HELLO, function() {
    console.log('Hi !!.')
})

emtr.emit(eventConfig.HELLO)

