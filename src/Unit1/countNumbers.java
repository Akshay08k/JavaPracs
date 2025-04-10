// WAP Count Positive, Negative, and Zero Elements in an Array

import java.util.Scanner;
public class countNumbers {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int pos = 0, neg = 0, zero = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array Elements(10 Elements): ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos++;
            } else if (arr[i] < 0) {
                neg++;
            } else {
                zero++;
            }
        }
        System.out.println("Positive Elements: " + pos);
        System.out.println("Negative Elements: " + neg);
        System.out.println("Zero Elements: " + zero);
    }
}
