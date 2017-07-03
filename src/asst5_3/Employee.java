/*Create an class Employee with following properties and functions */

package asst5_3;

public class Employee {

	int empId;
	String empName;
	int total_leaves ;
	double total_salary;
	
	public Employee(int empId, String empName,double total_salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.total_salary = total_salary;
	}
	void calculate_balance_leaves()
	{
		
	}
	boolean avail_leave(int no_of_leaves, char type_of_leave)
	{
		
		return false;
	}
	void calculate_salary()
	{
		
	}
}