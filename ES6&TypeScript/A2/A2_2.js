var listArmStrong = [0, 1, 153, 370, 371, 407];
var n = 0;
function Q2() {
    return { getNextArmstrong: function () { n += 1; return { value: listArmStrong[n], done: false }; } };
}
// Create Iterable
var n1 = Q2();
console.log("Armstrong numbers are : ");
console.log(n1.getNextArmstrong());
console.log(n1.getNextArmstrong());
console.log(n1.getNextArmstrong());
console.log(n1.getNextArmstrong());
console.log(n1.getNextArmstrong());
