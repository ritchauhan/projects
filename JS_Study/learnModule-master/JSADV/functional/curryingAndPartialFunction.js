// currying
const multiply = a => b=> c => (a*b*c)
console.log(multiply(10)(20)(30)) // even this has closure

// partial function
const multiplyByNum1 = (a, b, c) => a * b * c
const multiplyBind = multiplyByNum1.bind(null, 5)

console.log(multiplyBind(4,3))