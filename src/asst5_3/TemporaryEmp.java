/*Create two subclasses PermanentEmp and TemporaryEmp that extend Employee class with following 
properties and functions  */ 
package asst5_3;

public class TemporaryEmp extends Employee {

		public TemporaryEmp(int empId, String empName, int total_leaves,double total_salary) {
		super(empId, empName, total_salary);
		this.total_leaves = total_leaves;

		System.out.println("**************TemporaryEmp*****************");
		System.out.println("Id of the employee is : " + empId);
		System.out.println("Name of the employee : " + empName);
		System.out.println("Your Basic salary is : " + total_salary);
		System.out.println("Your total leave is : " + total_leaves);
		System.out.println();
	}

		@Override
		void calculate_balance_leaves()
		{
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