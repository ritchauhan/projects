let arr = [1, 2, 3, 4]

// one way
for (let i=0; i<arr.length; i++) {
    setTimeout(function(){
        console.log('i at index of : ', arr[i])
    }, 3000)
}

// second way
for (var i=0; i<arr.length; i++) {
    (function (clousureI) {
    setTimeout(function(){
        console.log('i at index of : ', arr[clousureI])
    }, 3000) }) (i)
}
