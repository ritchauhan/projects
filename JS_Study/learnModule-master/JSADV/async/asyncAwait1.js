async function fetchUser() {
    const resp = await fetch('https://jsonplaceholder.typicode.com/users') 
    console.log('test1')
    const data = await resp.json()
    console.log('test2')
    console.log(data)
}

fetchUser()