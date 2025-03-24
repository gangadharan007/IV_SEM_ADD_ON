package Session5;

public class AbstractEmployeeEx1 extends AbstractEmployeeEx{

	
	
	@Override
	public void FutureDesignation() {

System.out.println("Full Stack Dev");
		
	} 
	public static void main(String[] args) {
		
		AbstractEmployeeEx1 ae = new AbstractEmployeeEx1();
		ae.name();
		ae.designation();
		ae.FutureDesignation();
		
	}
}
