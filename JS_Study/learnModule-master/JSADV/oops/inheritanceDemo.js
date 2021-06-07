
class Character {
    constructor(name, weapon) {
        this.name = name
        this.weapon = weapon
    }
    attack() {
        console.log('Attack with : ', this.weapon)
    }
}

class Elf extends Character {
    constructor(name, weapon, type) {
        super(name, weapon)
        this.type = type
    }
}

const sam = new Elf('Sam', 'Bow', 'MetaHuman')
console.log(sam.attack())
const peter = new Elf('Peter', 'Arrow', 'Witch')
console.log(peter)
console.log(sam instanceof Character)
// console.log(Character instanceof peter)