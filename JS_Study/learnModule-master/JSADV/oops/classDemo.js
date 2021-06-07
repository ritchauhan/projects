
// class demo
class Elf {
    constructor(name, weapon) {
        this.name = name
        this.weapon = weapon
    }

    attack() {
        return 'attack with: ' + this.weapon
    }
}

let sam = new Elf('Sam', 'Bow')
console.log(sam.attack())
let peter = new Elf('Peter', 'Arrow')
console.log(peter.attack())