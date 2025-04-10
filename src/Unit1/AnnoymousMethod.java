
// Create a method greet() in a class Message and call it using an anonymous object.(
// Anonymous objects)


public class AnnoymousMethod {
    public static void main(String[] args) {
        Message m1 = new Message();
        Message m = new Message() {
            public void greet() {
                System.out.println("Annoymous Method Called");
            }
        };
        m.greet();
        m1.greet();

    }
}

class Message {
    public void greet() {
        System.out.println("Class Method");
    }
}