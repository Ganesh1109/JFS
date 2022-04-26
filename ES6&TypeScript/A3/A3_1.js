//Q1 :
var x = new Promise(function (resolve, reject) { return setTimeout(resolve, 100, (Math.random() * 100)); });
var y = new Promise(function (resolve, reject) { return setTimeout(resolve, 100, Math.random() * 100); });
Promise.all([x, y]).then(function (values) {
    var total = values.reduce(function (p, c) { return p + c; });
    console.log(total);
});
Promise.resolve(x).then(function (value) { console.log(value); });
Promise.resolve(y).then(function (value) { console.log(value); });
