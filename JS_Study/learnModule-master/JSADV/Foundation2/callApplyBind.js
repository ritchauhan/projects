var wizard = {
    name: 'Merlin',
    health: 40,
    heal: function(num1, num2) {
        this.health += num1 + num2;
        console.log(this.health)
    }
}

var archer= {
    name: 'Robin Hood',
    health : 30
}

console.log(archer)
wizard.heal.call(archer, 20, 50) // this takes comma seperated values as input
console.log(archer)
wizard.heal.apply(archer, [50, 40]) // this takes array as input
console.log(archer)

var healHealth = wizard.heal.bind(archer, 10, 20) // this return a function which can be used later
healHealth()
console.log(archer)