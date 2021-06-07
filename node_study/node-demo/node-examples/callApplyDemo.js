var obj = {
    name: 'Ritesh Kumar',
    greet: function() {
        console.log(`Hello ${this.name}`)
    }
}

obj.greet()
// difference b/w call and apply is that call will take param as comma seperated string but apply will take param as array.
obj.greet.call({name: 'Ritesh Chauhan'})
obj.greet.apply({name: 'Ritesh Chauhan'})