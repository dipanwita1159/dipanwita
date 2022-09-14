package locator;

import java.util.Scanner;

public class string {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String s="mohos10";
		System.out.println(s);
		String y="technology";
		String t = s.concat(y);
		System.out.println(t);
		Scanner input=new Scanner(System.in);
		System.out.println(t+"enter the string input");
	      String z=input.next();
		System.out.println(t+ " is having "+z.length());
		
		
		

	}

}
