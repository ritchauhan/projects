var util = require('util')

function Person() {
    this.firstName = 'Ritesh'
    this.lastName = 'Kumar'
}

Person.prototype.greet = function () {
    console.log(`name is ${this.firstName} ${this.lastName}`)
}

function Police () {
    Person.call(this)
    this.badgeNumber = '12455345'
}

util.inherits(Police, Person)

var policeDemo = new Police()
policeDemo.greet()
