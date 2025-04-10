// Create a class Employee with private fields name and salary. Use getters and setters to access
// and modify the fields.


public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setDetails("Akshay", 10000);
        System.out.println(e1.getDetails());
    }
}

class Employee{
    private String name;
    private int salary;
    public String getDetails(){
        return "Name = " + name + " Salary = " + salary;
    }
    public void setDetails(String name,int salary){
        this.name = name;
        this.salary = salary;
    }

}