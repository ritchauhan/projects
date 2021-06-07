const promise1 = new Promise((resolve, reject) => setTimeout(resolve, 6000))
const promise2 = new Promise((resolve, reject) => setTimeout(reject, 6000))

// Promise.all([promise1, promise2])
//     .then(data => console.log(data)) // undefined
//     // .catch(e => console.log(e))

    // this returns both the result either fullfilled or rejected
    Promise.allSettled([promise1, promise2])
    .then(data => console.log(data))