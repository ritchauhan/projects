function a() {
    let grandpa = 'Grandpa';
    return function b() {
        let father = 'father';
        return function c() {
            let son = 'son';
            return `${grandpa} -> ${father} -> ${son}`;
        }
    }
}

const boo = name1 => name2 => name3 => console.log(`${name1} -> ${name2} -> ${name3}`)
boo('test')('test1')('test3')
var test = a()
var test1 = test()
test()
// a()()()