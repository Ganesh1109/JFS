//1.
function add(a, b = 10) {
    return (a + b);
}

console.log(add(10, 40));
console.log(add(10));

//2.
function userFriends(username, ...arg) {
    console.log("Name: " + username);
    console.log("Friends: ");
    for (var i in arg) {
        console.log(arg[i]);
    }
}
userFriends("Ganesh", "Venkat", "Jaf", "Sukumar");
let Arr = ["Ram", "Bheem", "Dev", "Roy", "Jen"];
userFriends("Rajamouli", ...Arr);

//3.
function printCapitalNames(...names) {
    console.log("Names after captialize");
    for (var i in names) {
        console.log(names[i].toUpperCase());
    }
}
printCapitalNames(...Arr);