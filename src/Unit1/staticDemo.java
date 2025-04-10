// Create a class Utility with a static method convertToUpperCase(String) and a static variable
// counter to track calls.( Static methods and variables).

public class staticDemo {
    public static void main(String[] args) {

        System.out.println(Utility.convertToUpperCase("Doremon"));
        System.out.println(Utility.convertToUpperCase("Sinchan"));
        System.out.println(Utility.convertToUpperCase("Pokemon"));
        System.out.println("Number of times called: " + Utility.counter);
    }
}

class Utility{
    public static int counter = 0;

    public static String convertToUpperCase(String str){
        counter++;
        return str.toUpperCase();
    }
}
