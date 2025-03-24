package Session5;

public class Access_Person {

	
	public static void main(String[] args) {
		//Original Person Object 
		Person originalPerson = new Person("Goku" , 257);
		
		Person copiedPerson = new Person(originalPerson);//object dependency
		
		System.out.println("Original Person");
		originalPerson.displayinfo();
		
		System.out.println("Copied Person");
		copiedPerson.displayinfo();
		
	}
}
