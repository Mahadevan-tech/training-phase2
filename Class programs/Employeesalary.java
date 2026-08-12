// Q2. EMPLOYEE SALARY SYSTEM

// A company has different types of employees.

// Every employee has:
// - Employee ID
// - Employee Name
// - Basic Salary

// But the final salary calculation differs depending on the employee type.

// The company has:
// - Developer
// - Tester

// Requirements:
// - Create an abstract class Employee.
// - Add common employee details.
// - Create an abstract method calculateSalary().
// - Create Developer and Tester classes.
// - Override calculateSalary() in both classes.
// - Display the final salary.

// Example:
// Developer Salary = Basic Salary + Developer Bonus
// Tester Salary = Basic Salary + Testing Allowance

abstract class Employee {
    int employeeId;
    String employeeName;
    double basicSalary;

    Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Final Salary: " + calculateSalary());
    }
}
class Developer extends Employee {
    double developerBonus;

    Developer(int employeeId, String employeeName, double basicSalary, double developerBonus) {
        super(employeeId, employeeName, basicSalary);
        this.developerBonus = developerBonus;
    }

    double calculateSalary() {
        return basicSalary + developerBonus;
    }
}
class Tester extends Employee {
    double testingAllowance;

    Tester(int employeeId, String employeeName, double basicSalary, double testingAllowance) {
        super(employeeId, employeeName, basicSalary);
        this.testingAllowance = testingAllowance;
    }

    double calculateSalary() {
        return basicSalary + testingAllowance;
    }
}
class Employeesalary {
    public static void main(String[] args) {
        Employee emp1 = new Developer(101, "Hari", 50000, 10000);
        emp1.displayDetails();

        System.out.println();

        Employee emp2 = new Tester(102, "Abcd", 40000, 5000);
        emp2.displayDetails();
    }
}
