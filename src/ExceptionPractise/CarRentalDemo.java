
// Classes & Interface:
// Base Class Vehicle → Attributes: brand, model, rentalPricePerDay
// Child Class Car → Implements Rental, calculates rent.
// Exception InvalidDaysException → Thrown if days are negative.*/

class InvalidDaysException extends Exception{
    InvalidDaysException(String s){
        super(s);
    }
}

interface rental{
    int calculateRent(int days) throws InvalidDaysException;
}

class Vehicle{
    String brand;
    String model;
    int rentalPricePerDay;

    Vehicle(String brand,String model,int rentalPricePerDay){
        this.brand = brand;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    void displayInfo(){
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Rental Price Per Day: " + this.rentalPricePerDay);
    }
}

 class CarRental extends Vehicle implements rental{
    CarRental(String brand,String model,int rentalPricePerDay){
        super(brand,model,rentalPricePerDay);
    }
    public int calculateRent(int days) throws InvalidDaysException{
        if(days < 0){
            throw new InvalidDaysException("Days cannot be negative");
        }
        return days * this.rentalPricePerDay;
    }

}

public class CarRentalDemo{
    public static void main(String[] args) {
        CarRental car = new CarRental("Toyota","Fortuner",2000);
        car.displayInfo();
        try{
            System.out.println("Rent for 5 days: " + car.calculateRent(5));
            System.out.println("Rent for -5 days: " + car.calculateRent(-5));
        }catch(InvalidDaysException e){
            System.out.println(e);
        }
    }
}