// zModify the Student class to add default, parameterized &amp; copy constructors. Create three
// objects of the Student class to test the above three constructors. Print the content of the all
// the three objects

public class constructorOverloading {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();

        Student s2 = new Student("Akshay", 20, "Pune");
        s2.display();

        Student s3 = new Student(s2);
        s3.display();
    }
}

class Student {
    String name;
    int age;
    String address;

    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Unknown";
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        this.address = s.address;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);
    }
}
