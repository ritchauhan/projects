
function memoizationDemo() {
    const cache = {}
    return function(n) {
        if (n in cache) {
            return cache[n]
        } else {
            console.log('inside the settings')
            cache[n] = n +80
            return cache[n]
        }
    }
}

const memo = memoizationDemo()
console.log(memo(5))
console.log(memo(6))
console.log(memo(5))
console.log(memo(10))