function createBicycle (credence, speed, gear) {
    var newObj = {}
    newObj.credence = credence
    newObj.speed = speed
    newObj.gear = gear 
    return newObj
}

var cycle1 = createBicycle(10, 50, 2) 

// constructor 
function Bicycle(credence, speed, gear) {
    // var this = {}
    this.credence = credence
    this.speed = speed
    this.gear = gear
    //return this
}

var cycle2 = new Bicycle(50, 40, 4)
console.log(cycle1) // { credence: 10, speed: 50, gear: 2 }
console.log(cycle2) // Bicycle { credence: 50, speed: 40, gear: 4 }