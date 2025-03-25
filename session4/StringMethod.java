package session4;

import java.util.Scanner;

public class StringMethod {
	
public static void main(String[] args) {
//	String s1 = "Java Program";
//	//1.Length
//	System.out.println(s1.length());
//	
	//2.Equals()
	//3.EqualsIgnoreCase()
//	Scanner sc = new Scanner(System.in);
//	
//	System.out.println("Enter Username: ");
//	String Username = sc.nextLine();
//	
//	System.out.println("Enter Password: ");
//	String Password = sc.next();
//	
//	if(Username.equalsIgnoreCase("admin") && Password.equalsIgnoreCase("admin@123")) {
//		System.out.println("Success");
//		}else {
//			System.out.println("Error 404 Found ");
//		}
//	
	
//	String s2 = "ZOVIC";
//	String s3 = "ZOVIC";
//	
//	System.out.println(s2.equals(s3));
	
	//==
//	String s4 = "ZOYA";
//	String s5 = "ZOYA";
//	
//	System.out.println(s4==s5);
//	
	String name = new String("ZOYA");
	String name1 = new String("ZOYA");
	System.out.println(name==name1);
	
	//CompareTo
	//s1>s2-->positive number
	//s1<s2-->negative number
	//s1==s2-->0
	
	String s6 = "VEGETA";
	String s7 = "GOKU";
	
	System.out.println(s6.compareTo(s7));
	
	//Concat()
	String str1 = "Static ";
	String str2 = new String("Program");
	System.out.println(str1.concat(str2));
	
	//toCharArray()
	String str3 = "Welcome to Java: ";
	System.out.println("Value of method: ");
	char[] ch = str3.toCharArray();
	for(char st: ch){
		System.out.println(st);
	}
	
	//System.out.println(str3.toCharArray());
	
	//subString()
	System.out.println(str3.substring(5));
	System.out.println(str3.substring(0,10));
	
	//Intern
	String clg = "Kgisl";
	String Clg1 = new String("Kgisl");
	String str4 = Clg1.intern();
	
	System.out.println(clg==str4);
	
	
}
}
