var express = require('express')
var cookie = require('cookie-parser')

var app = express()
var port = process.env.PORT || 3000

app.use(cookie())

app.get('/', function (req, res) {
    // console.log(req)
    console.log(req.cookies)
    res.send('<html><body><h2>Hi How Are You ????</h2></body></html>')
})

app.get('/jsonApi', function (req, res) {
    res.json({ firstName : 'Ritesh', lastName: 'Kumar'})
})

app.listen(port)