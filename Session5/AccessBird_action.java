package Session5;

public class AccessBird_action extends Bird implements Flyable{

	@Override
	public void fly() {
		System.out.println("peacock,Pegion,Eagle");
		
	}
public static void main(String[] args) {
	
	 AccessBird_action bd = new  AccessBird_action();
	 bd.eat();
	 bd.fly();
	

}


	
	
}
