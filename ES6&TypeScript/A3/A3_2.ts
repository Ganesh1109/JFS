class account {
    [x: string]: any;
    constructor(id, name, balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
}
class Savingaccount extends account {
    constructor(id, name, balance, interest) {
        super(id, name, balance);
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.interest = interest;
    }
}
class Currentaccount extends account {
    constructor(id, name, balance, cashCredit) {
        super(id, name, balance);
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.cashCredit = cashCredit;
    }
}
let totalBankbalance = (...accounts) => {
    let totalBalance = 0;
    accounts.forEach((singleAccount) => {
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
const acc1 = new Savingaccount(12345677, "Ganesh", 40000, 10000);
const acc2 = new Currentaccount(12345678, "venkat", 25000, 10000);
const acc3 = new Savingaccount(12345675, "Roy", 90000, 2000);
const acc4 = new Currentaccount(12345670, "Gopi", 40000, 5000);
console.log("Total Balance in Bank is: " +
    totalBankbalance(acc1, acc2, acc3, acc4));
class Circle {
    [x: string]: any;
    constructor(radius) {
        this.radius = radius;
    }
    print() {
        return `The radius of Cicle is ${this.radius} Area is  ${(Math.PI * this.radius * this.radius)}`;
    }
}
class Employee {
    [x: string]: any;
    constructor(empname, empid, designation) {
        this.empname = empname;
        this.empid = empid;
        this.designation = designation;
    }
    print() {
        return `Employee Details:\n Employee Id:${this.empid}\n Employee Name: ${this.empname}\n Employee Designation: ${this.designation}`;
    }
}
function printAll(obj1, obj2) {
    console.log(obj1.print());
    console.log(obj2.print());
}
let circleObj = new Circle(2);
let employeeObj = new Employee("Ganesh", 1, "analyst");
printAll(circleObj, employeeObj);