function multiplyByNum(num1) {
    return function(num2) {
        return num1 * num2;
    }
}

// through lambda expression
const multiplyByNum1 = num1 => num2 => num1 * num2;
const multiplyByTwo = multiplyByNum(2);
console.log(multiplyByTwo(10))

const multiplyByFive = multiplyByNum(5)
console.log(multiplyByFive(10))

console.log(multiplyByNum1(10)(20))
console.log(multiplyByNum1(10)(50))

const multiplyTest = multiplyByNum(10)
console.log(multiplyTest(20)) // hof and closure
