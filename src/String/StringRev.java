/*Create a program with the following classes and interface:

1 Interface StringOperations with a method reverseString(String s).
2 Class BaseString (Parent class) with attributes originalString and lengthOfString.
3 Class StringProcessor (Child class) that:

Extends BaseString
Implements StringOperations
Implements reverseString() method using StringBuffer.
4 Handle Exceptions:
If the input string is null or empty, throw a CustomException.
Use try-catch to handle the exception in main().*/

// Step 1: Create an Interface

/**************Expected Output

Original String: HelloWorld
Length of String: 10
Reversed String: dlroWolleH
Exception Caught: Invalid String: String cannot be null or empty!
/******************/
interface StringOperations {
    String reverseString(String s) throws InvalidStringException;
}

// Step 2: Create a Custom Exception Class
class InvalidStringException extends Exception {
    public InvalidStringException(String message) {
        super(message);
    }
}

// Step 3: Create a Parent Class
class BaseString {
    String originalString;
    int lengthOfString;

    public BaseString(String originalString) {
        this.originalString = originalString;
        this.lengthOfString = originalString.length();
    }

    void displayInfo() {
        System.out.println("Original String: " + originalString);
        System.out.println("Length of String: " + lengthOfString);
    }
}

// Step 4: Create a Child Class That Implements the Interface
class StringProcessor extends BaseString implements StringOperations {
    
    public StringProcessor(String originalString) {
        super(originalString);
    }

    // Implement the interface method
    
    public String reverseString(String s) throws InvalidStringException {
        if (s == null || s.isEmpty()) {
            throw new InvalidStringException("Invalid String: String cannot be null or empty!");
        }
        // Using StringBuffer to reverse the string
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString();
    }
}

// Step 5: Main Method to Test the Program
public class StringRev {
    public static void main(String[] args) {
        try {
            // Creating an object of the child class
            StringProcessor sp = new StringProcessor("HelloWorld");

            // Display original string info
            sp.displayInfo();

            // Reverse string using the implemented method
            String reversed = sp.reverseString(sp.originalString);
            System.out.println("Reversed String: " + reversed);

            // Testing exception by passing an empty string
            String reversedEmpty = sp.reverseString("");

        } catch (InvalidStringException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
