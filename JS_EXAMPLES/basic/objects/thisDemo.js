function Bicycle (credence, speed, gear, tier) {
    this.credence = credence
    this.speed = speed
    this.gear = gear
    this.tier = tier
    this.inflate = function () {
        this.tier += 3
    }

}

let bicycle = new Bicycle(10, 20, 30, 40)
bicycle.inflate()
console.log(bicycle)

function Mechanic (name) {
    this.name = name
}

var mike = new Mechanic("Mike")
console.log(mike)
mike.inflate = bicycle.inflate
mike.inflate()
console.log(mike)
mike.inflate.call(bicycle)
console.log(bicycle)
var bicycle2 = new Bicycle(30, 60, 90, 120)
mike.inflate.call(bicycle2)
console.log(bicycle2)