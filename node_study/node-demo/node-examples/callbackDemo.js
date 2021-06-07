function greet(callback) {
    console.log('Hello!!..')
    let data  = {
        name: 'Ritesh Kumar'
    }
    callback(data)
    console.log('test')
}

function callback1(data) {
    console.log('CallBack 1 is called !!..', data)
}

// greet(function (data){
//     console.log('CallBack it is !!..', data.name)
// })

greet(callback1)