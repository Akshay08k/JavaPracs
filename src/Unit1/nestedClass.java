// Create a class Outer with a nested class Inner that can access the outer class&#39;s private fields.
// (Nested (inner) classes).

public class nestedClass {
    public static void main(String[] args) {    
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}

class Outer {
    private final int x = 10;
    private final int y = 20;
    class Inner {
        public void display() {
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}