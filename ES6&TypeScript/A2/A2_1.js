console.log("Q1");
var Fibonacci = /** @class */ (function () {
    function Fibonacci() {
        this.previousNo = Symbol();
        this.currentNo = Symbol();
        this.previousNo = 0;
        this.currentNo = 1;
    }
    Fibonacci.prototype.next = function () {
        var next = Symbol();
        next = this.previousNo + this.currentNo;
        this.previousNo = this.currentNo;
        this.currentNo = next;
        return next;
    };
    return Fibonacci;
}());
var obj = new Fibonacci();
//console.log("Fibonacci series End");
console.log(obj.next()); // 1
console.log(obj.next()); // 2
console.log(obj.next()); // 3
console.log(obj.next()); // 5
