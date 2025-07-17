package assignments;

public class Address {
	
	String city,house;
	Student ref	;
	
	public Address(String house,String city,Student ref ) {
		this.city=city;
		this.house=house;
		this.ref=ref;
		
	}
	
	public void display() {		
		 System.out.println(ref.name);
		 System.out.println(ref.rollno);
		 System.out.println(house);
		 System.out.println(city);
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj1=new Student("Sameesha",27);
	    Address obj2=new Address("karuvanbram","Kozhikode",obj1);
	    obj2.display();


	}
}
