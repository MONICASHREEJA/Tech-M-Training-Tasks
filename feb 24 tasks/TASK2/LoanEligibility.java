import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();
        System.out.print("Enter Annual Salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter Years Worked: ");
        int years = sc.nextInt();
        Employee emp = new Employee();
        emp.setEmployeeDetails(empId, empName, salary, years);
        emp.getEmployeeDetails();
        emp.getLoanEligibility();
        sc.close();
    }
}

class Employee {
    private int empId;
    private String empName;
    private double salary;
    private int years;
    public void setEmployeeDetails(int empId, String empName, double salary, int years) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.years = years;
    }
    public void getEmployeeDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("Years Worked: " + years);
    }

    public void getLoanEligibility() {
        if (years > 5) {
            
            int loan = 0;

            if (salary >= 1500000) {
                loan = 700000;
            } else if (salary >= 1000000) {
                loan = 500000;
            } else if (salary >= 600000) {
                loan = 200000;
            }
            if (loan > 0) {
                System.out.println("Loan Granted: " + loan);
            } else {
                System.out.println("Not eligible for a loan.");
            }
        } else {
            System.out.println("Not eligible for a loan (less than 5 years of work).");
        }
    }
}

