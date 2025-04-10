// Create a class Calculator with methods for addition, subtraction, multiplication, and division

import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calc c = new calc();
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Addition: " + c.add(num1, num2));
        System.out.println("Subtraction: " + c.sub(num1, num2)); 
        System.out.println("Multiplication: " + c.mul(num1, num2));
        System.out.println("Division: " + c.div((double)num1,(double) num2));

    }
}

class calc{
    int add(int num1,int num2){
        return num1+num2;
    }
    int sub(int num1,int num2){
        return num1-num2;
    }   
    int mul(int num1,int num2){
        return num1*num2;
    }
    double div(double num1,double num2){
            return num1/num2;
    }
}