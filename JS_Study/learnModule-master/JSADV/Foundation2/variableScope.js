function loop1() {
    // var is function scope so outside for loop i was accessable
    for(var i=0; i<5; i++) {
        console.log(i)
    }
    console.log('outside i : ', i) // 5
}

function loop2() {
    // let and const is block scope 
    for(let i=0; i<5; i++) {
        console.log(i)
    }
// console.log('outside i : ', i) // i is not defined
}

loop1()
loop2()