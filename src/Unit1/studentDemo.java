// Create a class Student with a constructor to initialize name and grade. Add a method to print
// details.(Constructor)


public class studentDemo {
    public static void main(String[] args) {
        student s1 = new student("Akshay", "A+");
        s1.printDetails();
    }
}

class student {
    String name, grade;

    student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    void printDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Grade: " + this.grade);
    }
}