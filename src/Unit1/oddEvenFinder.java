// WAP to find No is Odd and Even.(Take input from command line)

public class oddEvenFinder {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if (num % 2 == 0) {
            System.out.println(num + " is Even Number");
        } else {
            System.out.println(num + " is Odd Number");
        }
    }
}
