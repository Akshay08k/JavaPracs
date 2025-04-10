// WAP to print Factorial. (Take Input from User using Scanner class)

public class printFactorial {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
      System.out.println(factorial(num));
       
    }
     static int factorial(int num) {
       if(num == 0) {
           return 1;
       }
       return num * factorial(num - 1);
    }
}
