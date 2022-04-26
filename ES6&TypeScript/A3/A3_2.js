var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var account = /** @class */ (function () {
    function account(id, name, balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    return account;
}());
var Savingaccount = /** @class */ (function (_super) {
    __extends(Savingaccount, _super);
    function Savingaccount(id, name, balance, interest) {
        var _this = _super.call(this, id, name, balance) || this;
        _this.id = id;
        _this.name = name;
        _this.balance = balance;
        _this.interest = interest;
        return _this;
    }
    return Savingaccount;
}(account));
var Currentaccount = /** @class */ (function (_super) {
    __extends(Currentaccount, _super);
    function Currentaccount(id, name, balance, cashCredit) {
        var _this = _super.call(this, id, name, balance) || this;
        _this.id = id;
        _this.name = name;
        _this.balance = balance;
        _this.cashCredit = cashCredit;
        return _this;
    }
    return Currentaccount;
}(account));
var totalBankbalance = function () {
    var accounts = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        accounts[_i] = arguments[_i];
    }
    var totalBalance = 0;
    accounts.forEach(function (singleAccount) {
        if (singleAccount.constructor.name === "Savingaccount") {
            totalBalance =
                totalBalance + singleAccount.balance + singleAccount.interest;
        }
        else {
            totalBalance += singleAccount.balance;
            totalBalance -= singleAccount.cashCredit;
        }
    });
    return totalBalance;
};
var acc1 = new Savingaccount(123847334, "Sukumar", 40000, 10000);
var acc2 = new Currentaccount(1518600347, "Bablu", 25000, 10000);
var acc3 = new Savingaccount(151860233, "Latha", 90000, 2000);
var acc4 = new Currentaccount(151860323, "Jyanth", 40000, 5000);
console.log("Total Balance in Bank is: " +
    totalBankbalance(acc1, acc2, acc3, acc4));
var Circle = /** @class */ (function () {
    function Circle(radius) {
        this.radius = radius;
    }
    Circle.prototype.print = function () {
        return "The radius of Cicle is ".concat(this.radius, " Area is  ").concat((Math.PI * this.radius * this.radius));
    };
    return Circle;
}());
var Employee = /** @class */ (function () {
    function Employee(empname, empid, designation) {
        this.empname = empname;
        this.empid = empid;
        this.designation = designation;
    }
    Employee.prototype.print = function () {
        return "Employee Details:\n Employee Id:".concat(this.empid, "\n Employee Name: ").concat(this.empname, "\n Employee Designation: ").concat(this.designation);
    };
    return Employee;
}());
function printAll(obj1, obj2) {
    console.log(obj1.print());
    console.log(obj2.print());
}
var circleObj = new Circle(2);
var employeeObj = new Employee("Ganesh", 1, "analyst");
printAll(circleObj, employeeObj);
