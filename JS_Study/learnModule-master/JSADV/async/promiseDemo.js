
// run in windows
const urls = [
    'https://jsonplaceholder.typicode.com/posts',
    'https://jsonplaceholder.typicode.com/albums',
    'https://jsonplaceholder.typicode.com/todos'
]

Promise.all(urls.map(url => {
    return fetch(url).then(resp => resp.json())
}))
.then(result => {
    console.log(result[0])
    console.log(result[1])
    console.log(result[2])
})
.catch(() => console.log('Error!'))