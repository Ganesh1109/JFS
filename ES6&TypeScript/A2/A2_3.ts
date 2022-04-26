console.log("Q3");
//code to check a number is armstrong or not
function isArmstrong(number) {
    let sum = 0;
    let temp = number;
    while (temp > 0) {
        let digit = temp % 10;
        sum += digit ** 3;
        temp = Math.floor(temp / 10);
    }
    return (number == sum);
}
//Generator function tocall isArmstrong and reset the value of n if n is greater than 1000
function* getNextArmstrong1() {
    let i = 0;
    while (true) {
        if (isArmstrong(i)) {
            yield i;
        }
        if (i > 1000) {
            i = 0;
            yield "number is too larger";
        }
        i++;
    }
}
console.log("Armstrong numbers are : ");
console.log("using Generator");
var g = getNextArmstrong1();
console.log(g.next().value);
console.log(g.next().value);
console.log(g.next().value);
console.log(g.next().value);
console.log(g.next().value);
console.log(g.next().value);
console.log(g.next().value); // number is too larger 
console.log(g.next().value);
console.log(g.next().value);
console.log(g.next().value);
console.log(g.next().value);
console.log(g.next().value);