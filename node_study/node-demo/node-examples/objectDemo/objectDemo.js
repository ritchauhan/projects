var person = {
    firstName: '',
    lastName: '',
    greet: function () {
        console.log('First Name: ' + this.firstName + ' Last Name: ' + this.lastName)
    }
}

var ritesh = Object.create(person)
ritesh.firstName = 'Ritesh'
ritesh.lastName = 'Kumar'

var chauhan = Object.create(person)
chauhan.firstName = 'Rit'
chauhan.lastName = 'Chauhan'

ritesh.greet()
chauhan.greet()