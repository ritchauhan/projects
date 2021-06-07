// implement lastYear() function in 



Date.prototype.lastYear = function() {
    return this.getFullYear() -1
}

console.log(new Date().lastYear()) // 2020
console.log(new Date('1970').lastYear()) // 1969
// map function 

Array.prototype.map = function() {
    let arr = []
    for (let i=0; i<this.length; i++) {
        arr.push((this[i] + ' Enjoy!'))
    }
    return arr
}

console.log([20,30,50,60].map()) //  [ '20 Enjoy!', '30 Enjoy!', '50 Enjoy!', '60 Enjoy!' ]