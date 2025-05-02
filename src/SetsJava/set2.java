// Set 2: Employee Salary Validation
// Interface Salary → Contains method calculateSalary().
// Class Employee (Base Class) → Attributes: name, id, basicSalary, bonus.
// Class Payroll (Child Class) → Extends Employee, implements Salary.
// User-Defined Exception: LowSalaryException if salary < ₹10,000.

class LowSalaryException extends Exception {

    LowSalaryException(String message) {
        super(message);
    }
}

interface Salary {

    void calculateSalary() throws LowSalaryException;
}

class Employee {

    String name;
    int id, basicSalary, bonus;

    Employee(String name, int id, int basicSalary, int bonus) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    void displayDetails() {
        System.out.println("Name = " + this.name);
        System.out.println("ID = " + this.id);
        System.out.println("Basic Salary = " + this.basicSalary);
        System.out.println("Bonus = " + this.bonus);
    }
}

class Payroll extends Employee implements Salary {

    int salary;

    Payroll(String name, int id, int basicSalary, int bonus) {
        super(name, id, basicSalary, bonus);
    }

    public void calculateSalary() throws LowSalaryException {
        salary = basicSalary + bonus;
        if (salary < 10000) {
            throw new LowSalaryException("Lower Salary");
        } else {
            displayDetails();
        }
    }
}

public class set2 {

    public static void main(String args[]) {
        try {
            Payroll p1 = new Payroll("Akshay", 1, 7000, 2000);
            Payroll p2 = new Payroll("Yash", 2, 20000, 5000);

            p2.calculateSalary();
            p1.calculateSalary();

        } catch (LowSalaryException e) {
            System.out.println("Exception : " + e);
        }
    }
}
