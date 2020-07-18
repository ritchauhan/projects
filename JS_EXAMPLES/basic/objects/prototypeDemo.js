function foo() {}
console.log(foo) // [Function: foo]
var newFoo = new foo()
newFoo.test = 'test'
console.log(newFoo) //foo { test: 'test' }
console.log(newFoo.__proto__) //foo {}
newFoo.__proto__.hello = 'hello'
console.log(newFoo) // foo { test: 'test' }
console.log(newFoo.__proto__) // foo { hello: 'hello' }
console.log(newFoo.hello) // hello
newFoo.__proto__.test = '10' 
console.log(newFoo) // foo { test: 'test' }
console.log(newFoo.__proto__) // foo { hello: 'hello', test: '10' }
console.log(newFoo.test) // test
delete newFoo.test
console.log(newFoo.test) // 10

var newFoo1 = new foo()
console.log(newFoo1.__proto__)