// Create a class MathOperations with overloaded methods for addition (e.g., add(int, int) and
// add(double, double,int))

public class methodOverloading {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        System.out.println(mathOperations.add(2, 3));
        System.out.println(mathOperations.add(2.5, 3.5));
        System.out.println(mathOperations.add(2, 3, 4));
    }
}

class MathOperations {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
