var greetings = require('./greetings.json');

var greet = function() {
	console.log(greetings.es);
}

var demo = function() {
	console.log('check the access');
}

module.exports.greet = greet;
module.exports.demo = demo;