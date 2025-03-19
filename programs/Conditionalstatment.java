package programs;

import java.util.Scanner;

public class Conditionalstatment {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your age");
		int age = sc.nextInt();
		
		if(age>=18) {
			
			System.out.println("eligible for license");
		}
		else
		{
			System.out.println("not eligible for license");
		}
	}
	}


