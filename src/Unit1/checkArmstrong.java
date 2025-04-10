// WAP to Check No is Armstrong or Not.
import java.util.Scanner;

public class checkArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int rem, sum = 0, temp = num;
        while (num > 0) {
            rem = num % 10;
            sum = sum + (int)Math.pow(rem, 3);
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println(temp + " is Armstrong Number");
        } else {
            System.out.println(temp + " is Not Armstrong Number");
        }
    }

}
