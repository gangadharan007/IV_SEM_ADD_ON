package programs;

import java.util.Scanner;

public class Personalinfo {

	 public static void main(String[] args) {
		 
		try (Scanner obj = new Scanner (System.in));
				
			System.out.println("Enter the Name:");
			int Name = obj.nextInt();
			System.out.println("Enter the mobile:");
			int mobile = obj.nextInt();
			System.out.println("Enter ur address");
			int address  = obj.nextInt();
		
		
		System.out.println("Info entered");
		
	}
}
