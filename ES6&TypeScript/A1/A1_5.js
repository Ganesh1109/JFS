var __spreadArray = (this && this.__spreadArray) || function (to, from, pack) {
    if (pack || arguments.length === 2) for (var i = 0, l = from.length, ar; i < l; i++) {
        if (ar || !(i in from)) {
            if (!ar) ar = Array.prototype.slice.call(from, 0, i);
            ar[i] = from[i];
        }
    }
    return to.concat(ar || Array.prototype.slice.call(from));
};
//1.
function add(a, b) {
    if (b === void 0) { b = 10; }
    return (a + b);
}
console.log(add(10, 40));
console.log(add(10));
//2.
function userFriends(username) {
    var arg = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        arg[_i - 1] = arguments[_i];
    }
    console.log("Name: " + username);
    console.log("Friends: ");
    for (var i in arg) {
        console.log(arg[i]);
    }
}
userFriends("Ganesh", "Venkat", "Jaf", "Sukumar");
var Arr = ["Ram", "Bheem", "Dev", "Roy", "Jen"];
userFriends.apply(void 0, __spreadArray(["Rajamouli"], Arr, false));
//3.
function printCapitalNames() {
    var names = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        names[_i] = arguments[_i];
    }
    console.log("Names after captialize");
    for (var i in names) {
        console.log(names[i].toUpperCase());
    }
}
printCapitalNames.apply(void 0, Arr);
