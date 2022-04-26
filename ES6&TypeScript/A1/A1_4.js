var A1_4 = function () {
    var names = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        names[_i] = arguments[_i];
    }
    for (var i in names) {
        console.log('{name: \'' + names[i] + '\'},{length: ' + names[i].length + '}');
    }
};
var arr1 = ['Ivan', 'Tom', 'Jerry'];
A1_4.apply(void 0, arr1);
