// Write Program to Print Student Background details.(Ex. Name, Hobby..)

public class printBackground {
    public static void main(String[] args) {
        Student s1 = new Student("Akshay", "Coding", 20, "Pune");
        s1.printBackground();        
    }
}

class Student {
    String name;
    String hobby;
    int age;
    String address;
    Student(String name, String hobby, int age, String address) {
        this.name = name;
        this.hobby = hobby;
        this.age = age;
        this.address = address;
    }
    void printBackground() {
        System.out.println("Name: " + this.name);
        System.out.println("Hobby: " + this.hobby);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);
    }
}
