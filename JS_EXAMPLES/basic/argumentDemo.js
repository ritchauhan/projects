var test = function (a, b) {
    console.log(arguments) // { '0': 10, '1': 20, '2': 30, '3': 40, '4': 50 }
    var i;
    var sum = 0;
    for(i=0; i <arguments.length; i++) {
        sum += arguments[i]
    }
    console.log(sum) // 150
}

test(10, 20, 30, 40, 50)