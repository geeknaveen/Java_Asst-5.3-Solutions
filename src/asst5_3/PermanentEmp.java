/*Create two subclasses PermanentEmp and TemporaryEmp that extend Employee class with following 
properties and functions   */

package asst5_3;

public class PermanentEmp extends Employee{

	int paid_leave, sick_leave, casual_leave ;
	double basic, hra,pfa;

    public PermanentEmp(int empId, String empName, double total_salary,
			int sick_leave, int casual_leave) {
		super(empId, empName, total_salary);
		this.sick_leave = sick_leave;
		this.casual_leave = casual_leave;

		System.out.println("\n**************PermanentEmp*****************");
	}

	void print_leave_details()
	{
		System.out.println("Employee ID : " + empId);
		System.out.println("Name of the Employee : " + empName);
		System.out.println("Your Sick leaves are : " + sick_leave);
		System.out.println("Your Casual leaves are : " + casual_leave);
		System.out.println("Your Basic salary is : " + total_salary);
		System.out.println();
	}
	
	@Override
	void calculate_balance_leaves()
	{
		int total_leaves= sick_leave + casual_leave;
		System.out.println("You have taken " + total_leaves + " leaves. ");
		if(total_leaves >= 5)
		{
			System.out.println("Sorry!! you have no more leaves pending.");
		}
		else
		{
			System.out.println("You have " + (5- total_leaves) + " leaves pending.");
		}
		System.out.println();
	}
	
	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave)
	{
		return false;
	}
	
	@Override
	void calculate_salary()
	{
		total_salary = total_salary - ((12 * total_salary)/100) + ((50 * total_salary)/100);
		System.out.println("Total salary is : " + total_salary);	
		System.out.println();
	}
}