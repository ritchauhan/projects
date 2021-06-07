var http = require('http')
var fs = require('fs')

http.createServer(function(req, res) {
    if (req.url === '/') {
        res.writeHead(200, {'Content-Type' : 'text/html'})
        // var html = fs.readFileSync(__dirname + '/index.html')
        // res.end(html)
        // stream for perfomance
        fs.createReadStream(__dirname + '/index.html').pipe(res)
        // res.end('Hello World!!!..')
    } else {
        res.writeHead(400)
        res.end()
    }
   
}).listen(4321, '127.0.0.1')