package programs;

import java.util.Scanner;

public class SwitchCase {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("select an operation:");
		
		System.out.println("1.Adition");
		System.out.println("2.subtraction");
		System.out.println("3.multplication");
		System.out.println("4.division");
		
		System.out.println("Enter your chioce(1/2/3/4):");
		int choice = sc.nextInt();
		
		System.out.print("enter first number");
		double num1 = sc.nextDouble();
		
		System.out.print("enter second number");
		double num2 = sc.nextDouble();
		
		double result;
		
		switch(choice) {
		case 1:
			result = num1 + num2;
			System.out.println("result:"+result);
			break;
		case 2:
			result = num1 - num2;
			System.out.println("result:"+result);
			break;
		case 3:
			result = num1 * num2;
			System.out.println("result:"+result);
			break;
		case 4:
			if(num2 !=0) {
			result = num1 / num2;
			System.out.println("result:"+result);
		
			}
			else {
				System.out.println("error:Division 0 not allowed");
				
			}
			break;
			default:
				System.out.println("invalid mapala !!!!!!!!!!!!!!");
			}
			
			
	}

}
