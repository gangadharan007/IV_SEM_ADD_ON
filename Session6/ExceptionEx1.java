package Session6;

public class ExceptionEx1 {

	String str1 = "123";//Instance variable  
	
	public void name() {
		try {
			int i = Integer.parseInt(str1);
			System.out.println("The Value of Converted String: "+str1);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ExceptionEx1 ee = new ExceptionEx1();
		ee.name();
	}
}
