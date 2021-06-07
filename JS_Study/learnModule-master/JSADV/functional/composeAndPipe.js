
// f1(f2(f3(data)))
// compose(f1, f2, f3)(data)
// pipe(f3, f2, f1)(data)

const compose = (f, g) => (data) => f(g(data))
const pipe = (f, g) => (data) => g(f(data))
const multiplyBy3 = (num) => num * 3
const makePositive = (num) => Math.abs(num)
const multiplyAndMakePositive = compose(multiplyBy3, makePositive)

console.log(multiplyAndMakePositive(-50))