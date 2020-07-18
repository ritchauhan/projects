let calc =  function (a, b, callback) {
    return callback(a, b);
};

let add = function (a, b) {
    return a + b;
}

let multiply = function (a, b) {
    return a * b;
}

console.log(calc(10, 20, add));
console.log(calc(10, 20, multiply));
let result = calc(10, 20, function(a, b) {
    return a - b;
});
console.log(result)