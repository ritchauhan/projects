var testArr = [10, 20, "Hello", {}]

testArr.forEach (function(item, index, array) {
    console.log("item : "+item + " index : "+index)
});

var testFunct = function(item, index, array) {
    console.log("item : "+item + " index : "+index)
}


testArr.forEach(testFunct)