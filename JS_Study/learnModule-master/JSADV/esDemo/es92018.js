// object operator spread

const animal = {
    lion: 2,
    monkey: 5,
    bird: 4,
    tiger: 25
}

const {tiger, lion, ...rest} = animal

console.log(tiger) // 25
console.log(rest) // { monkey: 5, bird: 4 }

function test(p1, p2, p3) {
    console.log(p1) // 25
    console.log(p2) // 2
    console.log(p3) // { monkey: 5, bird: 4 }
}

test(tiger, lion, rest)

