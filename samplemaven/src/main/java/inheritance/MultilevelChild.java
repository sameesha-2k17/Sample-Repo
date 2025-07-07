package inheritance;

public class MultilevelChild extends MultilevelParentB {
 public void show()
 {
	 System.out.println("This is child class");
 }
 public static void main(String args[]) {
	 MultilevelChild obj = new MultilevelChild();
	 obj.display();
	 obj.print();
	 obj.show();
 }
}
