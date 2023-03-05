


/**
 * Tests the hierarchy of the employees
 * 
 * @author Alexander Raymond
 */
public class PayrollSystemTest 
{
 public static void main(String args[])
 {
     //creates subclasses objects
     SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
     HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
     CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
     BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);
     TemporaryPieceworker TemporaryPieceworker = new TemporaryPieceworker("Jackey", "Jose", "555-55-5555", 200, 5);
     
     
     //prints out the information
     System.out.println("Employees processed individually:\n");
     
     System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "earned", salariedEmployee.earnings());
     System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "earned", hourlyEmployee.earnings());
     System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "earned", commissionEmployee.earnings());
     System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());
     System.out.printf("%s\n%s: $%,.2f\n\n", TemporaryPieceworker, "earned", TemporaryPieceworker.earnings());
     
     
     //creates an array of the type of employees
     Employee employees[] = new Employee[5];
     
     employees[0] = salariedEmployee;
     employees[1] = hourlyEmployee;
     employees[2] = commissionEmployee;
     employees[3] = basePlusCommissionEmployee;
     employees[4] = TemporaryPieceworker;
     
     System.out.println("Employees processed polymorphically:\n");
     
     
     //goes through the array and processes each element of the array
     for(Employee currentEmployee : employees)
     {
         System.out.println(currentEmployee);
     }
 }   
}
