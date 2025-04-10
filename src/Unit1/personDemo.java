// Create a class Person with a copy constructor that duplicates an existing object.( Copy
// constructor).

public class personDemo {
    public static void main(String[] args) {
        person p1 = new person("Akshay", 20, "Pune");
        person p2 = new person();
        p2 = p1;
        p2.display();
    }
}

class person {
    String name;
    int age;
    String address;
    person(){
        this.name = "No name";
        this.age = 0;
        this.address = "No add";
    }
    person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);
    }
}