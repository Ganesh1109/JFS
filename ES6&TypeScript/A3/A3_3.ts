interface Printable{
    print():string;
}

class circle implements Printable{
    constructor(public radius:number){}
    print(): string {
        return `The radius of Cicle is ${this.radius} Area is  ${(Math.PI*this.radius*this.radius)}`;
    }

}
class employee implements Printable{
    constructor( public empname:string,public empid:number,public designation:string){
    }
    print(): string {
        return `Employee Details:\n Employee Id:${this.empid}\n Employee Name: ${this.empname}\n Employee Designation: ${this.designation}`;
    }

}
function printall(obj1,obj2){
    console.log(obj1.print());
    console.log(obj2.print());
}
let circleobj = new Circle(2);
let employeeobj = new Employee("Ganesh",1,"analyst");

console.log(circleobj,employeeobj);