package session4;

public class ConstructorExample {
	
	public ConstructorExample() {
		System.out.println("Default Constructor");
	}
	
	public ConstructorExample(String name, String age) {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Parameterized Constructor");
		
	}
	
	public int sum(int a,int b) {
		int res = a + b;
		return res;
	}
	
public static void main(String[] args) {
	ConstructorExample cx = new ConstructorExample();
	ConstructorExample ce = new ConstructorExample("Vishnu","20");
	System.out.println(ce.sum(5, 10));
}
}
