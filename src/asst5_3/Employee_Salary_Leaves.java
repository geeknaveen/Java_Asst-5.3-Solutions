/*Write a program that will compute an Employee's salary and manage their leave details.   
*/
package asst5_3;

public class Employee_Salary_Leaves {

public static void main(String[] args) {
		
			PermanentEmp pemp1 = new PermanentEmp(2, "Narendra Modi", 70000, 2, 1);
			pemp1.print_leave_details();
			pemp1.calculate_balance_leaves();
			pemp1.calculate_salary();
			
		TemporaryEmp temp = new TemporaryEmp(1,"Rahul Gandhi", 6 , 100);
			temp.calculate_balance_leaves();
			temp.calculate_salary();
	}
	
}