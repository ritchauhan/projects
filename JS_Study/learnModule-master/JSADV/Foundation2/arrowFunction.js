var obj = {
    a: 10,
    b: () => console.log(this.a, this),
    c: function() {
        console.log(this.a, this)
    }
}

obj.b() // undefined, {}
obj.c() // 10, {a=10, b: [function], c: [function]}