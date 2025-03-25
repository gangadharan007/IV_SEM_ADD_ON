package session4;

public class ConstructorOverloading {
	
	private String empname;
	private int empid;
	private String location;
	
	public ConstructorOverloading(String empname, int empid, String location) {
		this.empname = empname;
		this.empid = empid;
		this.location = location;
	}
	
	public ConstructorOverloading(String empname, String location) {
		this(empname,0,location);//call invoke using this keyword
	}
	
	public ConstructorOverloading(String empname, int empid) {
		this(empname,empid,null);
	}

	public void displayInfo() {
		System.out.println("EmpName: "+this.empname);
		System.out.println("Empid: "+this.empid);
		System.out.println("location: "+this.location);
	}
	public static void main(String[] args) {
		ConstructorOverloading cox = new ConstructorOverloading("Vishnu", 271005, "coimbatore");
		ConstructorOverloading cox1 = new ConstructorOverloading("ZOVIC", "BGMI");
		ConstructorOverloading cox2 = new ConstructorOverloading("ZOYA", 190919);
		cox.displayInfo();
		cox1.displayInfo();
		cox2.displayInfo();
		
		
	}
}
