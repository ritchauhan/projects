var Emitter = require('./emitter')

var emtr = new Emitter()

emtr.on('Hello', function() {
    console.log('Hello There !!.')
})

emtr.on('Hi', function() {
    console.log('Hi !!.')
})

emtr.emit()

