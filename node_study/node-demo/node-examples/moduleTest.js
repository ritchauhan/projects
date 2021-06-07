var moment = require('moment');
var moment1 = require('moment-timezone');

var greet = function () {
    console.log('Hello from greet');
}

var demo = function () {
    console.log('demo');
}

function getMomentDetails() {
    var currDate = moment();
    console.log(currDate.format('YYYY-MM-DD'));
    // console.log(currDate.tz.guess())
    var tz = moment1.tz('utc');
    console.log(tz)
}

function getUtcToLocalTime (value, timeZoneOffSet) {
    if (value) {
      return new Date(Date.now()).toLocaleString('en-GB', {timeZone: 'UTC' })
    //   return new Date(Date.now()).toLocaleString('en-GB')
    } else {
      return ''
    }
  }


function showTime(){
    // var fileName = getUtcToLocalTime(Date.now(), 'Asia/Kolkata')
    // var test = fileName.split(',')
    // console.log(test)
    // // console.log(test[1].replaceAll(':', ''))
    // console.log(replaceAll(test[0].slice(0,10), '/', '') + '_' + replaceAll(test[1].slice(1,10), ':', ''))
    // console.log(fileName)
    var d = new Date()
    var month = (d.getUTCMonth() + 1) < 10 ? '0' + (d.getUTCMonth() + 1) : (d.getUTCMonth() + 1)
    console.log(d.getUTCFullYear() +''+ month +''+ d.getUTCDate() +'_'+ d.getUTCHours() + d.getUTCMinutes() +d.getUTCSeconds() )
}

function replaceAll(str, find, replace) {
    return str.replace(new RegExp(find, 'g'), replace);
}

// getMomentDetails();
// showTime()
module.exports.demo = demo;
module.exports.greet = greet;

