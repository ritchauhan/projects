const obj = {
    name: 'RItesh'
}

function clone(obj) {
    return {...obj}
}

function updateName(obj) {
    const obj2 = clone(obj)
    obj2.name = 'Kumar'
    return obj2
}

// immutablity demo
console.log(obj, updateName(obj)) // { name: 'RItesh' } { name: 'Kumar' }