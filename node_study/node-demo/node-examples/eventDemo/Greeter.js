'use strict'

var eventEmiiter = require('events');

module.exports = class Greeter extends eventEmiiter {
    constructor() {
        super()
        this.hello = 'Hello World!.'
    }

    greet(data) {
        console.log(`Hey ${this.hello}`)
        this.emit('greet', data) 
    }
}