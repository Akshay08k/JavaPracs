// WAP to print No is Palindrome or not. (Take Input from User using Scanner class)
// WAP to Check No is Palindrome or Not.

import java.util.Scanner;

public class checkPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int rem, rev = 0, temp = num;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (temp == rev) {
            System.out.println(temp + " is Palindrome Number");
        } else {
            System.out.println(temp + " is Not Palindrome Number");
        }
    }
}
