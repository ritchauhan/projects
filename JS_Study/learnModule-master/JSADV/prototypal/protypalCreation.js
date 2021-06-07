let human = {
    mortal: true
}

let socretes = Object.create(human) // way to create prototype
socretes.age = 70

console.log(socretes) // { age:70 }
console.log(socretes.mortal) // true
console.log(human.isPrototypeOf(socretes)) // true
console.log(human) // { mortal:true }