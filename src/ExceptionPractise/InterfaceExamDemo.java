// //---------------------------
// Program:2
// //---------------------------
// implementing a simple student result calculation system. Below is the definition of the required components:
// 1)Interface Exam
// Contains a method percent_cal(), which calculates the percentage of marks obtained by a student.
// 2)Class Student (Base Class)
// Contains attributes: name, rollno, mark1, and mark2.
// Includes a parameterized constructor to initialize these attributes.
// 3)Class Result (Child Class)
// Extends Student and implements Exam interface.
// Implements the percent_cal() method to compute the percentage.
// Throws a user-defined exception if the percentage is below a certain threshold (e.g., failing criteria).
// User-Defined Exception
// A custom exception class (e.g., FailException) to handle cases where a student’s percentage is below the passing mark.

class FailException extends Exception{
    FailException(String s){
        super(s);
    }
}

interface exam{
    void percent_cal() throws FailException;
}

class Student{
    String name;
    int rollno,mark1,mark2;

    Student(String name,int rollno,int mark1,int mark2){
        this.name = name;
        this.rollno = rollno;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    void displayInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Roll No: " + this.rollno);
        System.out.println("Mark 1: " + this.mark1);
        System.out.println("Mark 2: " + this.mark2);
    }
}

class Result extends Student implements exam{
    Result(String name,int rollno,int mark1,int mark2){
        super(name,rollno,mark1,mark2);
    }

    public void percent_cal() throws FailException{
        int total = this.mark1 + this.mark2;
        double percent = (total/200.0)*100;
        if(percent < 40){
            throw new FailException("Student Failed");
        }
        System.out.println("Percentage: " + percent);
    }
}

public class InterfaceExamDemo {
    public static void main(String args[]) {
        Result r1 = new Result("Akshay", 1, 50, 50);
        Result r2 = new Result("Nothing", 2, 20, 40);
     
        r2.displayInfo();
        try{
            r2.percent_cal();
        }catch(FailException e){
            System.out.println(e);
        }
    }
}
