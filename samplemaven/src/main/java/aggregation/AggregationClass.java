package aggregation;

public class AggregationClass {
	String city;
	String state; //instance variable
	AggregationParent ref;
	public AggregationClass(String city, String state, AggregationParent ref) { //construstor
		this.city=city;
		this.state=state;
		this.ref=ref;
	}
	public void display() // instance method
	{
		System.out.println(city+" " +state);
		System.out.println(ref.name+" "+ref.rollno+" "+ref.address);
		
	}
	
	public static void main (String args[])
{ 
	AggregationParent obj1= new AggregationParent("sam",28,"Manjeri");
	AggregationClass obj2 = new AggregationClass("Kozhikode","Kerala",obj1);
	obj2.display();
}
}
