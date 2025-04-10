// WAP to take values from user in 2D Array and perform row wise and column wise sum.
import java.util.Scanner;

public class rowcolSum {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int rowSum[] = new int[3];
        int colSum[] = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Elements(9 Elements): ");
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                rowSum[i] = rowSum[i] + arr[i][j];
                colSum[j] = colSum[j] + arr[i][j];
            }
        }   
        for (int i = 0; i < rowSum.length; i++) {
            System.out.println("Row " + i + " Sum: " + rowSum[i]);
        }
        for (int i = 0; i < colSum.length; i++) {
            System.out.println("Column " + i + " Sum: " + colSum[i]);
        }
    }
}
