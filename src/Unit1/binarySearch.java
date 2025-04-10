// WAP to Find a Specific Element in an Array.

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int element;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Elements(10 Elements): ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the Element to be Searched: ");
        element = sc.nextInt();
        int start = 0, end = arr.length - 1, mid = (start + end) / 2;
        while (start <= end) {
            if (arr[mid] == element) {
                System.out.println("Element Found at Index: " + mid);
                break;
            } else if (arr[mid] < element) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        if (start > end) {
            System.out.println("Element Not Found");
        }
        
    }
}
