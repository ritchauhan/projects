const elf = {
    attack() {
        return 'attack with : ' + this.weapon
    }
}

function createElf(name, weapon) {
    let elfLoc = Object.create(elf)
    // console.log(elfLoc.__proto__)
    elfLoc.name = name
    elfLoc.weapon = weapon
    return elfLoc
}

let sam = createElf('Sam', 'Bow')
console.log(sam.attack())
let peter = createElf('Peter', 'Arrow')
console.log(peter.attack())