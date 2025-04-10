// WAP to String is Palindrome or Not.
import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String rev = "";
        //append string from back
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println(str + " is Palindrome String");
        } else {
            System.out.println(str + " is Not Palindrome String");
        }
    }
}
