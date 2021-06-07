var obj1 = {
    a: 'test',
    b: function() {
        console.log('test')
    }
}

var obj2 = obj1
obj2.a = 'test2'
console.log(obj1)
console.log(obj2)

var arr1 = [10, 20, 30]
var arr2 = arr1

console.log(arr1 == arr2)

arr1.push(40)
arr2.push(50)
// pass by reference means mutable
console.log(arr1) // [10, 20, 30, 40, 50]
console.log(arr2) // [10, 20, 30, 40, 50]

var obj3 = {
    a : 1
}

var obj4 = {
    a : 1
}

console.log(obj3 == obj4) // false since both objects has different memory location

console.log(JSON.stringify(obj3) == JSON.stringify(obj4)) // true