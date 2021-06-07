
function Elf(name, weapon) {
    this.name = name
    this.weapon = weapon
}

Elf.prototype.attack = function() {
    return 'attack with : ' + this.weapon
}

Elf.prototype.build = function() {
    
    // problem

    // let build = function() {
    //     // function inside function takes another scope
    //     console.log(this) // global
    //     console.log('build house: ' + this.name) // build house with undefined 
    // }
    // build()

    // solution

    // 1st way
    let self = this // declare and assign this to some other variable
    let build = function() {
        console.log('build house: ' + self.name)
    }
    build()
    // return build.bind(this) // second way
    
}

let sam = new Elf('Sam', 'Bow')
console.log(sam.attack())
// sam.build()() // second way
sam.build()
let peter = new Elf('Peter', 'Stone')
console.log(peter.attack())