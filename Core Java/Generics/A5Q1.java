import java.util.HashSet;
import java.util.Set;
class Employees
{
	int eid,esal;
	String ename,edept;
	public Employees(int eid,String ename, int esal, String edept)
	{
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
		this.edept=edept;
	}
@Override
	public String toString() {
		return "Employees: [EmployeeID =" + eid + ", EmployeeSalary =" + esal + ", EmployeeName =" + ename + ", EmployeeDepartment =" + edept + "]";
	}
}
public class A5Q1 {
	public static void main(String[] args)
	{
		Employees e1=new Employees(358,"Ganesh",30000,"Analyst");
		Set<Employees> employees= new HashSet<>();
		employees.add(e1);		
		System.out.println(employees);
	}
}