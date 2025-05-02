// Create Following :-
// Define a superclass Employee with attributes like name, id,
// and salary. Create subclasses like Manager, Developer, and
// Tester that inherit from Employee and add specific attributes
// or methods relevant to their roles.
// Add getDetails() functions in all classe

class Employee {

    String name;
    int id;
    int salary;

    Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void getDetails() {
        System.out.println("Name = " + name);
        System.out.println("ID = " + id);
        System.out.println("Salary = " + salary);
    }
}

class Manager extends Employee {

    int bonus;

    Manager(String name, int id, int salary, int bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    void getDetails() {
        super.getDetails();
        System.out.println("Bonus = " + bonus);
    }
}

class Developer extends Employee {

    int bonus;
    String language;

    Developer(String name, int id, int salary, int bonus, String language) {
        super(name, id, salary);
        this.bonus = bonus;
        this.language = language;
    }

    void getDetails() {
        super.getDetails();

        System.out.println("Bonus = " + bonus);
        System.out.println("Language = " + this.language);
    }
}

class Tester extends Employee {

    int bonus;
    String Methodology;

    Tester(String name, int id, int salary, int bonus, String Methodology) {
        super(name, id, salary);
        this.bonus = bonus;
        this.Methodology = Methodology;
    }

    void getDetails() {
        super.getDetails();
        System.out.println("Bonus = " + bonus);
        System.out.println("Methodology = " + this.Methodology);
    }
}

public class Set2 {

    public static void main(String[] args) {
        Manager m1 = new Manager("Akshay", 1, 10000, 2000);
        m1.getDetails();

        Developer d1 = new Developer("Yash", 2, 20000, 5000, "Java");
        d1.getDetails();

        Tester t1 = new Tester("Vishal", 3, 30000, 10000, "Agile");
        t1.getDetails();

    }
}
