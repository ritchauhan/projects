var buffer = Buffer.from('Hello')

console.log(buffer)
console.log(buffer.toString())
console.log(buffer.toJSON())
buffer.write('World')
console.log(buffer.toString())
