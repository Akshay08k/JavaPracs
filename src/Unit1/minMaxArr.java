// WAP to Find the minimum and maximum Element in an Array

import java.util.Scanner;

public class minMaxArr {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        System.out.println("Enter the Array Elements(10 Elements): ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Minimum Element: "+min(arr));
        System.out.println("Maximum Element: "+max(arr));
    
    }
    static int min(int arr[]){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    static int max(int arr[]){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

}
