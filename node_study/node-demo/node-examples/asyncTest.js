async function test(num) {
    console.log('async function');
    for(let i=num; i>0; i--) {
        if(i === 1) {
            return 'test';
        }
    }
} 

async function testCall() {
    console.log('test async execution :');
    let a = await test(1000000);
    console.log(a);
    console.log('test async execution is done: ');
}


testCall();