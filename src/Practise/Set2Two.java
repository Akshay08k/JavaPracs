// Write Program to Create user Defined exception. When Data
// is not Found Click on button.

import java.util.Scanner;

class DataNotFoundException extends Exception {

    public DataNotFoundException(String message) {
        super(message);
    }

}

public class Set2Two {

    public static void main(String[] args) throws DataNotFoundException {
        String Names[] = {"Akshay", "Yash", "Vishal", "Rohit", "Kunal"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        boolean flag = true;

        for (String st : Names) {
            if (name.equals(st)) {
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        if (flag == false) {
            throw new DataNotFoundException("Data Not Found");
        }

    }

}
