console.log("Q1");
class Fibonacci {
    [x: string]: any;
    constructor() {
        this.previousNo = Symbol();
        this.currentNo = Symbol();
        this.previousNo = 0;
        this.currentNo = 1;
    }
    next() {
        let next = Symbol();
        next = this.previousNo + this.currentNo;
        this.previousNo = this.currentNo;
        this.currentNo = next;
        return next;
    }
}
let obj = new Fibonacci();
//console.log("Fibonacci series End");
console.log(obj.next()); // 1
console.log(obj.next()); // 2
console.log(obj.next()); // 3
console.log(obj.next()); // 5
