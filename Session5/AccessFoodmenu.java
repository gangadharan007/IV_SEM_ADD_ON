package Session5;

public class AccessFoodmenu implements Vegitems , NonVegitems{

	@Override
	public void fry() {
		// TODO Auto-generated method stub
		System.out.println("Chicken Fry , prwan fry, fish fry");
		}

	@Override
	public void gravy() {
	
		System.out.println("Chicken chukka, mutton Chukka");
	}

	@Override
	public void breakFast() {
		
		System.out.println("idly,Dosa,sambar vada, poori");
		
	}

	@Override
	public void lunch() {
		
		System.out.println("meals,Chicken Biriyani, Varity rice");
		
	}
	
	
public static void main(String[] args) {
	 AccessFoodmenu ac = new  AccessFoodmenu();
	 ac.breakFast();
	 ac.lunch();
	 ac.fry();
	 ac.gravy();
	
	 
	 
}
}
