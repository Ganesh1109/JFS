var circle = /** @class */ (function () {
    function circle(radius) {
        this.radius = radius;
    }
    circle.prototype.print = function () {
        return "The radius of Cicle is ".concat(this.radius, " Area is  ").concat((Math.PI * this.radius * this.radius));
    };
    return circle;
}());
var employee = /** @class */ (function () {
    function employee(empname, empid, designation) {
        this.empname = empname;
        this.empid = empid;
        this.designation = designation;
    }
    employee.prototype.print = function () {
        return "Employee Details:\n Employee Id:".concat(this.empid, "\n Employee Name: ").concat(this.empname, "\n Employee Designation: ").concat(this.designation);
    };
    return employee;
}());
function printall(obj1, obj2) {
    console.log(obj1.print());
    console.log(obj2.print());
}
var circleobj = new Circle(2);
var employeeobj = new Employee("Ganesh", 1, "analyst");
console.log(circleobj, employeeobj);
