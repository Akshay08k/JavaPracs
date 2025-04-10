// Create a class Car with attributes brand and model, and a method to display car details.(
// Defining a class, creating objects, working with methods)
public class carDemo {
    public static void main(String[] args) {
        car c1 = new car("Honda", "City");
        c1.display();
    }
}

class car{
    String brand;
    String model;
    car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    void display(){
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
    }
}