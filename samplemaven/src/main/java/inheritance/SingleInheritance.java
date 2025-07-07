package inheritance;

public class SingleInheritance {
    public void display() {
        System.out.println("This is a parent class");
    }
}

 class Child extends SingleInheritance {
    public void print() {
        System.out.println("This is a child class");
    }

    public static void main(String args[]) {
        Child obj = new Child(); // Child has access to both methods
        obj.print();             // From Child class
        obj.display();           // From Parent class
    }
}